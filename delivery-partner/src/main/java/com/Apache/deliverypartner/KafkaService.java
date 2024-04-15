package com.Apache.deliverypartner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send("location-update-topic",location);
    }
}
