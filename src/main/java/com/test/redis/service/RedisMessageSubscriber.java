package com.test.redis.service;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RedisMessageSubscriber implements MessageListener {

    public void onMessage(Message message, byte[] pattern) {
        System.out.println("Redis pubsub event received: " + message.toString());
    }
}
