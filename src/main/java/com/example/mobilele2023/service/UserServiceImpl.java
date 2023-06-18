package com.example.mobilele2023.service;

import com.example.mobilele2023.domain.entity.UserEntity;
import com.example.mobilele2023.domain.serviceModel.UserServiceModel;
import com.example.mobilele2023.repository.UserRepository;
import com.example.mobilele2023.util.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository,
                           ModelMapper modelMapper, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }


    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        userRepository.save(modelMapper.map(userServiceModel, UserEntity.class));
    }


    @Override
    public void loginUser(Long id, String username) {
        currentUser.setId(id).setUsername(username);
    }



}
