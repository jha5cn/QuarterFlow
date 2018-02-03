package com.jea.QuarterFlow.QuarterFlow.services;

import com.jea.QuarterFlow.QuarterFlow.domain.User;
import com.jea.QuarterFlow.QuarterFlow.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Object getUser(String email) {
        return userRepository.getByEmail(email);
    }

    public void createUser(String email) {
        User newUser = new User();
        newUser.setEmail(email);
        userRepository.save(newUser);
    }
}
