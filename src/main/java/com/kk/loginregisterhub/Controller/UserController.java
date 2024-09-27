package com.kk.loginregisterhub.Controller;

import com.kk.loginregisterhub.Model.User;
import com.kk.loginregisterhub.Services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestParam String username,@RequestParam String password) {
        User user = userService.loginUser(username,password);
        if (user != null) {
            System.out.println("login success");
            return user;
        }
        return null;
    }
}
