package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.UserRepository;
import com.backendshopee.security.JwtProvider;
import com.backendshopee.service.AuthenticationResponse;
import com.backendshopee.service.IUserService;

import java.util.Optional;
@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	@Autowired
    private JwtProvider jwtProvider;
	
	@Override
	public void addUser(UserEntity userEntity) {
		userRepository.save(userEntity);	
	}
	
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public void editUser(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String login(UserEntity userEntity) {
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userEntity.getName(),
				userEntity.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        
        String authenticationToken = jwtProvider.generateToken(authenticate);
        System.out.print("token" + authenticationToken);
        return null;
	}

	
	public Optional<org.springframework.security.core.userdetails.User> getCurrentUser() {
        org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User) SecurityContextHolder.
                getContext().getAuthentication().getPrincipal();
        System.out.print("6666");
        return Optional.ofNullable(principal);
    }
	
}
