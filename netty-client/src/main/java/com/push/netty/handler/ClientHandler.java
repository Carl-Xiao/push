package com.push.netty.handler;


import com.common.model.CustomProtocol;
import io.netty.buffer.ByteBuf;
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
public class ClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private final static Logger logger = LoggerFactory.getLogger(ClientHandler.class);

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            if (idleStateEvent.state() == IdleState.WRITER_IDLE) {
                logger.info("超过5s没有收到消息");
                CustomProtocol customProtocol = new CustomProtocol(45678L, "pong");
                ctx.writeAndFlush(Unpooled.copiedBuffer(customProtocol.toString(), CharsetUtil.UTF_8))
                        .addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            }
        }
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        logger.info("channelId{} 建立联系", ctx.channel().id().toString());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        logger.info("客户端收到消息={}", in.toString(CharsetUtil.UTF_8));
    }
}
