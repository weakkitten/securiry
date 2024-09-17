package com.security.pet.User.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShortUserDto {
    private final long id;
    private final String name;
    private final String password;
}
