package com.push.netty.initlizer;

import com.common.model.protobuf.BaseRequestProto;
import com.push.netty.handler.ServerHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * @author carl-xiao
 **/
public class ServerInitlizer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline()
                //心跳检查机制 5s超时时间
                .addLast(new IdleStateHandler(5, 0, 0))
                // google Protobuf 编解码 start
                .addLast(new ProtobufVarint32FrameDecoder())
                .addLast(new ProtobufDecoder(BaseRequestProto.Request.getDefaultInstance()))
                .addLast(new ProtobufVarint32LengthFieldPrepender())
                .addLast(new ProtobufEncoder())
                // google Protobuf 编解码 end
                .addLast(new ServerHandler());
    }
}
