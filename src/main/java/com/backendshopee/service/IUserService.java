package com.backendshopee.service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import com.backendshopee.entity.UserEntity;

public interface IUserService {
	public void addUser(UserEntity userEntity);
	public List<UserEntity> findAll();
	public void deleteUser(long id);
	public void editUser(long id);
	public String login(UserEntity userEntity);
	public UserEntity findById(Long id);
	public UserEntity findByName(String name);
	public void favoriteProduct(Long id);
	public Optional<org.springframework.security.core.userdetails.User> getCurrentUser();
	public String getUserLogin();
}
