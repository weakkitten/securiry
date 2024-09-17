package com.security.pet.User.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewUserDto {
    private final String name;
    private final String password;
}
