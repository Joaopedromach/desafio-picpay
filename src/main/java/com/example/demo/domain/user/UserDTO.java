package com.example.demo.domain.user;

import java.math.BigDecimal;

public record UserDTO(
        String name,
        String document,
        BigDecimal balance,
        String email,
        String passord,
        UserType userType


) {
}
