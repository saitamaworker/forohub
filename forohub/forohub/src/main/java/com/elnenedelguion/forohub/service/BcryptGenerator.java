package com.elnenedelguion.forohub.service;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BcryptGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "admin";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }

    @Test
    public void testPasswordVerification() {
        String rawPassword = "admin";
        String encodedPassword = "$2a$10$xehuhGOKWDjecXRSdLauSO6hLMxAXc8cGhCLmvEuDsP3WFaP9wIGO";

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);

        System.out.println("Password matches: " + matches);
        // Debería imprimir: Password matches: true
    }
}

