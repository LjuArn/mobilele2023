package com.example.mobilele2023.domain.bindingModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegisterBindingModel {

    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    private String username;
    @NotEmpty
    @Email(message = "Email cannot be empty")
    private String email;
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    private String password;
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    private String confirmPassword;


    
}
