package com.vvoinarovych.taskplanner.service;

import com.vvoinarovych.taskplanner.web.dto.auth.JwtRequest;
import com.vvoinarovych.taskplanner.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
