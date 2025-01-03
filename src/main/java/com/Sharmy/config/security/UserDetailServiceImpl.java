package com.Sharmy.config.security;

import com.Sharmy.dto.ConfirmationResponse;
import com.Sharmy.dto.UserRequest;
import com.Sharmy.entity.User;
import com.Sharmy.service.impl.GymratServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl {
    private final GymratServiceImpl gymratService;

    public ConfirmationResponse signUp(UserRequest userRequest) {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        gymratService.saveUser(user);

        return ConfirmationResponse.builder()
                .estado("ok")
                .mensaje("Se ha enviado un código de confirmación")
                .build();
    }
}
