package com.softuni.coffeeshop.model.binding;
import jakarta.validation.constraints.Size;

public class UserLoginBindingModel {

    @Size(min = 5, max = 20, message = "My username error message")
    private String username;

    @Size(min = 3, message = "My password error")
    private String password;

    public UserLoginBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
