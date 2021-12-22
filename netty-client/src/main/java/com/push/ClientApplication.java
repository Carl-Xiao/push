package com.push;

import com.common.model.CustomProtocol;
import com.push.client.NettyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author carl-xiao
 **/
@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Autowired
    private NettyClient heartbeatClient;

    @Override
    public void run(String... args) throws Exception {
        heartbeatClient.sendMsg(new CustomProtocol(9999L, "ping"));
    }
}
