package com.security.pet.User.model;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {
    public User toUser(NewUserDto dto) {
        return User.builder()
                    .name(dto.getName())
                    .password(dto.getPassword())
                    .build();
    }
}
