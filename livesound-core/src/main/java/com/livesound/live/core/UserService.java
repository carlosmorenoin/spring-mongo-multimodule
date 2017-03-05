package com.livesound.live.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(final User user) {
        this.userRepository.save(user);
        return user;
    }

    public User retrieveUser(final String id) {
        return this.userRepository.findOne(id);
    }
}
