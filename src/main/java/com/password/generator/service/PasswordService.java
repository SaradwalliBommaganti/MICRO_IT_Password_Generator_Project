package com.password.generator.service;

import com.password.generator.model.PasswordRequest;

public interface PasswordService {
    String generatePassword(PasswordRequest request);
}

