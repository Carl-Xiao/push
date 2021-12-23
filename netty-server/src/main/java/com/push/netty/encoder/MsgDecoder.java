package com.push.netty.encoder;

import com.common.model.CustomProtocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * 解码
 *
 * @author carl-xiao
 **/
public class MsgDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List<Object> out) throws Exception {
        //消息体
        long header = in.readLong();
        //正文内容
        byte[] bytes = new byte[in.readableBytes()];
        in.readBytes(bytes);
        String content = new String(bytes);
        CustomProtocol customProtocol = new CustomProtocol() ;
        customProtocol.setId(header);
        customProtocol.setContent(content) ;
        out.add(customProtocol) ;
    }
}
