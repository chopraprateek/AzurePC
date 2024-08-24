package com.cloud.azure.rest;

import com.azure.spring.cloud.feature.management.FeatureManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerFeature {

    private FeatureManager featureManager;

    public HelloControllerFeature(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/welcome")
    public String mainWithParam() {
        String message = "";
        Boolean isEnabled= featureManager.isEnabled("Beta");
        if(isEnabled){
            message  = "Beta enabled";
        }
        return "welcome !! "+message;
    }
}
