package com.example.mobilele2023.service;

import com.example.mobilele2023.domain.serviceModel.UserServiceModel;

public interface UserService {

    void loginUser(Long id, String username);

    void registerUser(UserServiceModel userServiceModel);
}
