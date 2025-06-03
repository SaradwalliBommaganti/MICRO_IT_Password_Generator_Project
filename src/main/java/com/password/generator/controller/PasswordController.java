package com.password.generator.controller;

import com.password.generator.model.PasswordRequest;
import com.password.generator.model.PasswordResponse;
import com.password.generator.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @PostMapping("/generate")
    public PasswordResponse generatePassword(@RequestBody PasswordRequest request) {
        String password = passwordService.generatePassword(request);
        return new PasswordResponse(password);
    }
}
