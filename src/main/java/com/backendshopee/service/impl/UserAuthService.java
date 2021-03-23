package com.backendshopee.service.impl;


import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.UserRepository;
@Service
public class UserAuthService implements UserDetailsService {

	@Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) {
        UserEntity user = userRepository.findByName(name);
        return new org.springframework.security.core.userdetails.User(user.getName(),
                user.getPassword(),
                true, true, true, true,
                getAuthorities(name));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role_user) {
        return Collections.singletonList(new SimpleGrantedAuthority(role_user));
    }
}
