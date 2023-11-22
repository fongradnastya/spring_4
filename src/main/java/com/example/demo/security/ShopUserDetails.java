package com.example.demo.security;

import java.util.Collection;
import java.util.Collections;

import com.example.demo.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Реализация интерфейса UserDetails для пользователя магазина.
 */
public class ShopUserDetails implements UserDetails {

    private final User shopUser;

    /**
     * Конструктор для ShopUserDetails.
     * @param shopUser Пользователь магазина.
     */
    public ShopUserDetails(User shopUser) {
        this.shopUser = shopUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(shopUser.getStatus()));
    }

    @Override
    public String getPassword() {
        return shopUser.getPassword();
    }

    @Override
    public String getUsername() {
        return shopUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * Получает объект пользователя магазина.
     * @return Объект пользователя магазина.
     */
    public User getUser() {
        return shopUser;
    }
}
