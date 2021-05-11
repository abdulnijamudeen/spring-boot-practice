package com.nizam.springbootpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        log.info("Home Controller - logger");
        return ResponseEntity.ok("Hello User, This is home page!");
    }
}
