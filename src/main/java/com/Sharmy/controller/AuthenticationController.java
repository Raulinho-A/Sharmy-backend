package com.Sharmy.controller;

import com.Sharmy.config.security.UserDetailServiceImpl;
import com.Sharmy.dto.ConfirmationResponse;
import com.Sharmy.dto.UserRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthenticationController {
    private final UserDetailServiceImpl userDetailService;

    @PostMapping("/signUp")
    public ResponseEntity<ConfirmationResponse> signUp(@Valid @RequestBody UserRequest request) {
        return ResponseEntity.ok(userDetailService.signUp(request));
    }

}
