package com.password.generator.service;


import com.password.generator.model.PasswordRequest;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class PasswordServiceImpl implements PasswordService {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_-+=<>?/";

    @Override
    public String generatePassword(PasswordRequest request) {
        StringBuilder characterPool = new StringBuilder();

        if (request.isUseUppercase()) characterPool.append(UPPERCASE);
        if (request.isUseLowercase()) characterPool.append(LOWERCASE);
        if (request.isUseDigits()) characterPool.append(DIGITS);
        if (request.isUseSymbols()) characterPool.append(SYMBOLS);

        if (characterPool.length() == 0) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < request.getLength(); i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}

