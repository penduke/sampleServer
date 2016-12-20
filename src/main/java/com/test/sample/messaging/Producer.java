package com.test.sample.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Created by Suhas Nair on 04/12/16.
 */
public class Producer {

    @Autowired
    private AmqpTemplate messageQueue;

    private final AtomicInteger counter = new AtomicInteger();

    //@Scheduled(fixedRate = 1000)
    public void execute() {
        System.out.println("execute...");
        messageQueue.convertAndSend("hello " + counter.incrementAndGet());
    }
}