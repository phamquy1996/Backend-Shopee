package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.UserRepository;
import com.backendshopee.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;
	
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
	
}
