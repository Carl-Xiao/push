package com.push.zk.config;

import com.push.zk.spring.SpringBeanFactory;
import com.push.zk.utils.ZkUtils;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/25
 */
public class ZKThread implements Runnable {
    private static ZkUtils zkUtil;
    private static AppConfig appConfiguration;

    public ZKThread() {
        zkUtil = SpringBeanFactory.getBean(ZkUtils.class);
        appConfiguration = SpringBeanFactory.getBean(AppConfig.class);
    }

    @Override
    public void run() {
        //创建父节点
        zkUtil.createEphemeralNode();
        //是否要将自己注册到 ZK
        if (appConfiguration.isZkSwitch()) {
            String path = appConfiguration.getZkRoot() + "/ip-" + ip + ":" + port;
            zkUtil.createNode(path, path);
            logger.info("注册 zookeeper 成功，msg=[{}]", path);
        }
        //注册监听服务
        zkUtil.subscribeEvent(appConfiguration.getZkRoot());
    }

}
