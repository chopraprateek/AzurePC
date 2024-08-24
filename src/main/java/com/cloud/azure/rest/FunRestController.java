package com.cloud.azure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String Hello(){
        return "Hello..How are you?";
    }

    @GetMapping("/startnow")
    public String HelloWow(){
        return "I am good?";
    }

    @GetMapping("/startok")
    public String HelloOk(){
        return "ok cool !";
    }
}
