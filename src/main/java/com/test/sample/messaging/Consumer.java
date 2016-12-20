package com.test.sample.messaging;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by Suhas Nair on 04/12/16.
 */
public class Consumer implements MessageListener {

    public void onMessage(Message message) {
        System.out.println(message);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}