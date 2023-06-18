package com.example.mobilele2023.service;

import com.example.mobilele2023.repository.UserRepository;
import com.example.mobilele2023.util.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository,
                           CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public void loginUser(Long id, String username) {

        currentUser.setId(id).setUsername(username);
    }
}
