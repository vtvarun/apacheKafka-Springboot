package com.Apache.deliverypartner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/update-location")
    public String updateLocation(){
        String currentLocation = "("+ Math.random() * 100 +","+ Math.random() * 100 +")";
        kafkaService.updateLocation(currentLocation);
        return "Location updated";
    }
}
