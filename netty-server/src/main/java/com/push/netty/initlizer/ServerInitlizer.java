package com.push.netty.initlizer;

import com.push.netty.encoder.MsgDecoder;
import com.push.netty.handler.ServerHandler;
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
                .addLast(new MsgDecoder())
                .addLast(new ServerHandler());
    }
}
