package com.push.netty.handler;


import com.common.model.CustomProtocol;
import com.common.model.protobuf.BaseRequestProto;
import com.push.netty.ChannelHolder;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author carl-xiao
 **/
public class ServerHandler extends SimpleChannelInboundHandler<BaseRequestProto.Request> {

    private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);
    private final static Object HEAR_BEAT = Unpooled.copiedBuffer(new CustomProtocol(12345L, "pong").toString(), CharsetUtil.UTF_8);

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            if (idleStateEvent.state() == IdleState.READER_IDLE) {
                logger.info("超过5s没有收到消息");
                ctx.writeAndFlush(HEAR_BEAT).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            }
        }
        super.userEventTriggered(ctx, evt);
    }

    /**
     * @param ctx handlerContext
     * @throws Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        ChannelHolder.remove((NioSocketChannel) ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, BaseRequestProto.Request request) throws Exception {
        logger.info("request msg {}", request.toString());
    }
}
