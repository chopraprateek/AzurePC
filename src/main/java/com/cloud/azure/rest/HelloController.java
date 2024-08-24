package com.cloud.azure.rest;

import com.cloud.azure.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MyProperties properties;

    public HelloController(MyProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/getMessage")
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }
}