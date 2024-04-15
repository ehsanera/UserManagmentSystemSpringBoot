package com.ehsan.usermanagmentsystemspringboot.service;

import com.ehsan.usermanagmentsystemspringboot.entity.Users;
import com.ehsan.usermanagmentsystemspringboot.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Flux<Users> findAll() {
        return userRepository.findAll();
    }

    public Mono<Users> create(String name) {
        Users newUser = new Users();
        newUser.setName(name);
        return userRepository.save(newUser);
    }
}
