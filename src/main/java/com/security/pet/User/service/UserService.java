package com.security.pet.User.service;

import com.security.pet.User.model.NewUserDto;
import com.security.pet.User.model.User;
import com.security.pet.User.model.UserMapper;
import com.security.pet.User.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public ResponseEntity<Object> createUser(NewUserDto dto) {
        User user = UserMapper.toUser(dto);
        repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
}
