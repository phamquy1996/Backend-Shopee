package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.service.IRoleService;
import com.backendshopee.service.IUserService;
@RestController 
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	IUserService iuserservice;
	
	@Autowired
	IRoleService iRoleService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping(value = "addUser")
	public UserEntity addUser(@Valid @RequestBody UserEntity model) {
		String code = bCryptPasswordEncoder.encode(model.getPassword());
		model.setPassword(code);
		model.setRoles(iRoleService.findByRole("ADMIN"));
		iuserservice.addUser(model);
		return model;
	}
	
	@GetMapping(value = "/allUser")
	public List<UserEntity> allUser(){
		return iuserservice.findAll();
	}
	
	@PostMapping(value = "/editUser/{id}")
	public UserEntity editUser(@RequestBody UserEntity model, @PathVariable(value = "id") long id ){
		model.setId(id);
		iuserservice.addUser(model);
		return model;
	}
	
	@GetMapping(value = "/deleteUser/{id}")
	public void deleteUser(@PathVariable(value = "id") long id){
		iuserservice.deleteUser(id);
	}
}
