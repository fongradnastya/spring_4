package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import com.example.demo.util.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    private final UserValidator userValidator;

    @Autowired
    public UserController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @GetMapping("/sign-up")
    public String registration(@ModelAttribute("user") User user) {
        return "sign_up";
    }

    @PostMapping("/process_reg")
    public String doReg(@ModelAttribute("user") @Valid User shopUser, BindingResult bindingResult) {
        userValidator.validate(shopUser, bindingResult);
        if (bindingResult.hasErrors()) {
            return "sign_up";
        } else {
            userService.registerUser(shopUser);
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
