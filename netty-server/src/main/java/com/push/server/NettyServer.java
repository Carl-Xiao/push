package com.push.server;

import com.alibaba.fastjson.JSON;
import com.common.model.CustomProtocol;
import com.push.handler.ServerHandler;
import com.push.initlizer.ServerInitlizer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetSocketAddress;

/**
 * @author carl-xiao
 **/
@Component
public class NettyServer {
    private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);

    private EventLoopGroup boss = new NioEventLoopGroup();
    private EventLoopGroup worker = new NioEventLoopGroup();

    private NioServerSocketChannel channel;

    @Value("${netty.port}")
    Integer nettyPort;

    /**
     * 初始化
     */
    @PostConstruct
    public void init() {
        try {
            ServerBootstrap bootstrap = new ServerBootstrap()
                    .group(boss, worker)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(nettyPort))
                    .childHandler(new ServerInitlizer());
            ChannelFuture future = bootstrap.bind().sync();
            if (future.isSuccess()) {
                logger.info("netty 启动成功 端口号{}", nettyPort);
            }
            channel = (NioServerSocketChannel) future.channel();
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    /**
     * 销毁
     */
    @PreDestroy
    public void destroy() {
        boss.shutdownGracefully();
        worker.shutdownGracefully();
    }

    public void sendMsg(CustomProtocol customProtocol) {
        ChannelFuture future =  channel.writeAndFlush(customProtocol);

        future.addListener((ChannelFutureListener) channelFuture ->
                logger.info("服务端手动发消息成功={}", JSON.toJSONString(customProtocol)));

    }

}
