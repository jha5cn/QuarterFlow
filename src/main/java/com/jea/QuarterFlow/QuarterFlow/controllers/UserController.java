package com.jea.QuarterFlow.QuarterFlow.controllers;

import com.jea.QuarterFlow.QuarterFlow.domain.dto.CreateUserRequest;
import com.jea.QuarterFlow.QuarterFlow.services.UserService;
import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by jahn on 1/29/18.
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "user", method = GET)
    public ResponseEntity<?> getUser(@RequestParam("email") String email) {
        EmailValidator emailValidator = new EmailValidator();
        if (!emailValidator.isValid(email, null)) {
            return ResponseEntity.status(400).build();
        }

        return ResponseEntity.ok(userService.getUser(email));
    }

    @RequestMapping(value = "user", method = POST)
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest) {
        if (StringUtils.isEmpty(createUserRequest.getEmail())) {
            return ResponseEntity.status(400).build();
        }

        try {
            userService.createUser(createUserRequest.getEmail());
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
