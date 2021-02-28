package com.backendshopee.service;

import java.util.List;
import java.util.Optional;

import com.backendshopee.entity.UserEntity;

public interface IUserService {
	public void addUser(UserEntity userEntity);
	public List<UserEntity> findAll();
	public void deleteUser(long id);
	public void editUser(long id);
	public String login(UserEntity userEntity);
	public Optional<org.springframework.security.core.userdetails.User> getCurrentUser();
}
