package com.security.jwtSecurity.services;

import com.security.jwtSecurity.Entities.AuthenticationRequest;
import com.security.jwtSecurity.Entities.AuthenticationResponse;
import com.security.jwtSecurity.Entities.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {


    public AuthenticationResponse register(RegisterRequest registerRequest) {

        return null;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        return null;
    }
}
