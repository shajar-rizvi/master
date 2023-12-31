package com.example.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.sql.SQLOutput;

@RestController
@RequestMapping("/api/webhook")
public class WebhoController {

    @PostMapping
    public ResponseEntity<String> WebNotification(@RequestBody String requestBody){
        System.out.println("*****   Web Hook Notification   *****" + requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
