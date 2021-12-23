package com.push.netty.encoder;

import com.common.model.CustomProtocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 加密
 *
 * @author carl-xiao
 **/
public class MsgEncoder extends MessageToByteEncoder<CustomProtocol> {
    @Override
    protected void encode(ChannelHandlerContext ctx, CustomProtocol msg, ByteBuf out) throws Exception {
        out.writeLong(msg.getId());
        out.writeBytes(msg.getContent().getBytes());
    }
}
