package com.vvoinarovych.taskplanner.service.impl;

import com.vvoinarovych.taskplanner.service.AuthService;
import com.vvoinarovych.taskplanner.web.dto.auth.JwtRequest;
import com.vvoinarovych.taskplanner.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
