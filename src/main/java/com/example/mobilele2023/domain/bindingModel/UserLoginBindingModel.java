package com.example.mobilele2023.domain.bindingModel;

import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.GetMapping;

public class UserLoginBindingModel {

    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    private String username;
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    private String password;

    public String getUsername() {
        return username;
    }

    public UserLoginBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "UserLoginBindingModel{" +
                "username='" + username + '\'' +
                ", password='" + (password != null ? "What is this" : null) + '\'' +
                '}';
    }
}
