package com.push.netty.client;

import com.common.model.CustomProtocol;
import com.common.model.protobuf.BaseRequestProto;
import com.push.netty.initlizer.ClientInitlizer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author carl-xiao
 **/
@Component
public class NettyClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(NettyClient.class);

    private EventLoopGroup group = new NioEventLoopGroup();

    @Value("${netty.server.port}")
    private int nettyPort;

    @Value("${netty.server.host}")
    private String host;

    private SocketChannel channel;

    @PostConstruct
    public void start() throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ClientInitlizer())
        ;

        ChannelFuture future = bootstrap.connect(host, nettyPort).sync();
        if (future.isSuccess()) {
            LOGGER.info("启动 Netty 成功");
        }
        channel = (SocketChannel) future.channel();
    }

    /**
     * 发送消息
     *
     * @param customProtocol
     */
    public void sendMsg(CustomProtocol customProtocol) {
        channel.writeAndFlush(customProtocol);
    }


    public void sendPbMsg(CustomProtocol customProtocol) {
        BaseRequestProto.Request protocol = BaseRequestProto.Request.newBuilder()
                .setReqId(customProtocol.getId() + "")
                .setReqMsg(customProtocol.getContent())
                .build();

        ChannelFuture future = channel.writeAndFlush(protocol);
        future.addListener((ChannelFutureListener) channelFuture ->
                LOGGER.info("客户端手动发送 Google Protocol 成功={}", customProtocol.toString()));
    }


}
