package com.backendshopee.service.impl;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.UserRepository;
import com.backendshopee.security.JwtProvider;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	private AuthenticationManager authenticationManager;
	

	@Autowired
	private IProductService iProductService;

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
		Authentication authenticate = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(userEntity.getName(), userEntity.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authenticate);

		String authenticationToken = jwtProvider.generateJwtToken(authenticate);
		System.out.print("token" + authenticationToken);
		return authenticationToken;
	}

	public Optional<org.springframework.security.core.userdetails.User> getCurrentUser() {
		org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		return Optional.ofNullable(principal);
	}

	@Override
	public UserEntity findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void favoriteProduct(Long id) {
		// TODO Auto-generated method stub
		List<ProductEntity> products = new ArrayList<>();
		ProductEntity product = iProductService.findByProduct(id);
		products.add(product);
//		System.out.print(product.getName());
		UserEntity user = userRepository.findByName("admin");
//		user.removeClassB(product);
//		user.setProductsFavourite(products);
//		System.out.print(userRepository.getAdminList());
//		user.getProductsFavourite();
//		if(user.getProductsFavourite().isEmpty()) {
//			user.addClassB(product);
//			userRepository.save(user);
//			
//		}else {
//			for (ProductEntity productEntity:user.getProductsFavourite()) {
//				if (productEntity.getId() == product.getId()) {
//					user.removeClassB(product);
//					userRepository.save(user);
//				} else {
//					System.out.print("Đã có");
//					user.addClassB(product);
//					userRepository.save(user);
//				}
//			}
//				
//		}
//		for (ProductEntity productEntity:user.getProductsFavourite()) {
//			System.out.print("ok");
//			if (productEntity.getId() == product.getId()) {
//				System.out.print("ok");
//				user.removeClassB(product);
//				userRepository.save(user);
//			} else {
//				System.out.print("ok");
//				user.setProductsFavourite(products);
//				userRepository.save(user);
//			}
//		}
//		userRepository.save(user);
	}

	@Override
	public UserEntity findByName(String name) {
		// TODO Auto-generated method stub
		UserEntity user = userRepository.findByName(name);
		return user;
	}

	@Override
	public String getUserLogin() {
		// TODO Auto-generated method stub
		java.security.Principal principal = null;
		return principal.getName();
	}

}
