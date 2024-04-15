package com.ehsan.usermanagmentsystemspringboot.controller;

import com.ehsan.usermanagmentsystemspringboot.entity.Users;
import com.ehsan.usermanagmentsystemspringboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public Flux<ResponseEntity<Users>> findAll() {
        return userService.findAll()
                .map(user -> ResponseEntity.ok().body(user))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Mono<ResponseEntity<Users>> create(@RequestBody String name) {
        return userService.create(name)
                .map(user -> ResponseEntity.status(HttpStatus.CREATED).body(user));
    }
}
