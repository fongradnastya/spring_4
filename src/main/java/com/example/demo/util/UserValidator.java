package com.example.demo.util;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Валидатор для проверки уникальности имени пользователя.
 */
@Component
public class UserValidator implements Validator {

    private final UserService shopUserService;

    /**
     * Конструктор для UserValidator.
     *
     * @param shopUserService Сервис пользователей магазина.
     */
    @Autowired
    public UserValidator(UserService shopUserService) {
        this.shopUserService = shopUserService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User shopUser = (User) target;
        if (shopUserService.hasUsername(shopUser.getUsername())) {
            errors.rejectValue("username", "", "This username was already taken!");
        }

    }
}