package com.jea.QuarterFlow.QuarterFlow.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jahn on 1/29/18.
 */
@RestController
@RequestMapping("/")
public class UserController {

    @RequestMapping()
    public ResponseEntity<?> getSomething() {
        return ResponseEntity.ok("hello");
    }
}
