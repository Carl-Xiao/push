package com.push.initlizer;

import com.push.encoder.MsgEncoder;
import com.push.handler.ServerHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * @author carl-xiao
 **/
public class ServerInitlizer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline()
                .addLast(new IdleStateHandler(5, 0, 0))
                .addLast(new MsgEncoder())
                .addLast(new ServerHandler());
    }
}
