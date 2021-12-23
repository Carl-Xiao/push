package com.push.endpoint;

import com.push.netty.ChannelHolder;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/23
 */
@Component
@Endpoint(id = "features")
public class CustomEndpoint {
    @ReadOperation
    public Map<Long, NioSocketChannel> features() {
        return ChannelHolder.MAP;
    }
}
