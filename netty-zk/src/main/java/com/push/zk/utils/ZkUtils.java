package com.push.zk.utils;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * zk的helper
 *
 * @author carl-xiao
 */
@Component
public class ZkUtils {
    private final static Logger logger = LoggerFactory.getLogger(ZkUtils.class);

    @Resource
    CuratorFramework zkClient;

    public static final String ZK_REGISTER_ROOT_PATH = "/rpc-common";
    /**
     * zhucejiedian
     */
    private static Set<String> registeredPathSet = ConcurrentHashMap.newKeySet();
    private static final Map<String, List<String>> serviceAddressMap = new ConcurrentHashMap<>();

    /**
     * 创建临时节点
     * 临时节点驻存在ZooKeeper中，当连接和session断掉时被删除。
     */
    public void createEphemeralNode(final String path) {
        try {
            zkClient.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(path);
        } catch (Exception e) {
            logger.error("occur exception:", e);
        }
    }

    /**
     * 清空注册中心的数据
     */
    public void clearRegistry() {
        registeredPathSet.stream().parallel().forEach(p -> {
            try {
                zkClient.delete().forPath(p);
            } catch (Exception e) {
            }
        });
        logger.info("服务端（Provider）所有注册的服务都被清空:[{}]", registeredPathSet.toString());
    }

    /**
     * create persistentNode
     *
     * @param path
     */
    public void createPersistentNode(final String path) {
        try {
            if (registeredPathSet.contains(path) || zkClient.checkExists().forPath(path) != null) {
                logger.info("节点已经存在，节点为:[{}]", path);
            } else {
                zkClient.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath(path);
                logger.info("节点创建成功，节点为:[{}]", path);
            }
            registeredPathSet.add(path);
        } catch (Exception e) {
        }
    }

    /**
     * 获取某个字节下的子节点
     */
    public List<String> getChildrenNodes(final String serviceName) {
        if (serviceAddressMap.containsKey(serviceName)) {
            return serviceAddressMap.get(serviceName);
        }
        List<String> result = Collections.emptyList();
        String servicePath = ZK_REGISTER_ROOT_PATH + "/" + serviceName;
        try {
            result = zkClient.getChildren().forPath(servicePath);
            serviceAddressMap.put(serviceName, result);
            registerWatcher(serviceName);
        } catch (Exception e) {
            logger.error("occur exception:", e);
        }
        return result;
    }

    public List<String> getChildrenNodes() {
        List<String> result = Collections.emptyList();
        String servicePath = ZK_REGISTER_ROOT_PATH;
        try {
            result = zkClient.getChildren().forPath(servicePath);
        } catch (Exception e) {
            logger.error("occur exception:", e);
        }
        return result;
    }

    /**
     * 注册监听
     *
     * @param serviceName 服务名称
     */
    private void registerWatcher(String serviceName) {
        String servicePath = ZkUtils.ZK_REGISTER_ROOT_PATH + "/" + serviceName;
        PathChildrenCache pathChildrenCache = new PathChildrenCache(zkClient, servicePath, true);
        PathChildrenCacheListener pathChildrenCacheListener = (curatorFramework, pathChildrenCacheEvent) -> {
            List<String> serviceAddresses = curatorFramework.getChildren().forPath(servicePath);
            serviceAddressMap.put(serviceName, serviceAddresses);
        };
        pathChildrenCache.getListenable().addListener(pathChildrenCacheListener);
        try {
            pathChildrenCache.start();
        } catch (Exception e) {
            logger.error("occur exception:", e);
        }
    }

}
