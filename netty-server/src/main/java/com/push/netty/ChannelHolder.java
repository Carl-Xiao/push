package com.push.netty;

import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/23
 */
public class ChannelHolder {
    public static final Map<Long, NioSocketChannel> MAP = new ConcurrentHashMap<>(16) ;

    public static void put(Long id,NioSocketChannel socketChannel){
        MAP.put(id,socketChannel) ;
    }

    public static NioSocketChannel get(Long id) {
        return MAP.get(id);
    }

    public static void remove(NioSocketChannel nioSocketChannel) {
        MAP.entrySet().stream().filter(entry -> entry.getValue() == nioSocketChannel).forEach(entry -> {
            MAP.remove(entry.getKey());
        });
    }
}
