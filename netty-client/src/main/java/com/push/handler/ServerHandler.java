package com.push.handler;


import com.common.model.CustomProtocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author carl-xiao
 **/
public class ServerHandler extends SimpleChannelInboundHandler<CustomProtocol> {

    private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            if (idleStateEvent.state() == IdleState.READER_IDLE) {
                logger.info("超过5s没有收到消息");
                CustomProtocol customProtocol = new CustomProtocol(12345L, "pong");
                ctx.writeAndFlush(Unpooled.copiedBuffer(customProtocol.toString(), CharsetUtil.UTF_8))
                        .addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            }
        }
        super.userEventTriggered(ctx, evt);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CustomProtocol customProtocol) throws Exception {
        logger.info("customProtocol={}", customProtocol);
        customProtocol.setHeader(customProtocol.getHeader() + 1000);
        customProtocol.setContent(customProtocol.getContent() + 1000);
        ctx.writeAndFlush(Unpooled.copiedBuffer(customProtocol.toString(), CharsetUtil.UTF_8));
    }
}
