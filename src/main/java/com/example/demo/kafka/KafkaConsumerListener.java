package com.example.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener implements MessageListener<String, Object> {

    @Override
    public void onMessage(ConsumerRecord<String, Object> message) {
        if("topic"==message.topic()){
            //业务代码
        }
    }
}
