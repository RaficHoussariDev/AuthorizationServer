package com.taco.cloud.authorizationserver.utils;

import com.taco.cloud.authorizationserver.models.User;
import com.taco.cloud.authorizationserver.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserSeed implements CommandLineRunner {
    private final UserRepository userRepository;

    @Autowired
    public UserSeed(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User hero = new User("hero", "{noop}password", "ROLE_ADMIN");
        User chef = new User("chef", "{noop}password", "ROLE_ADMIN");
        User butler = new User("butler", "{noop}password", "ROLE_ADMIN");

        userRepository.save(hero);
        userRepository.save(chef);
        userRepository.save(butler);
    }
}
