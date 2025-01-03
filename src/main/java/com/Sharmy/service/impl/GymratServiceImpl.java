package com.Sharmy.service.impl;

import com.Sharmy.entity.User;
import com.Sharmy.repository.UserRepository;
import com.Sharmy.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GymratServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public void saveUser(User user){ userRepository.save(user); }
}
