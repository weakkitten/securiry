package com.security.pet.User.controller;

import com.security.pet.User.model.NewUserDto;
import com.security.pet.User.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;

    @PostMapping()
    public ResponseEntity<Object> createUser(NewUserDto dto) {
        return service.createUser(dto);
    }
}
