package com.backendshopee.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.UserRepository;
import com.backendshopee.security.JwtProvider;
import com.backendshopee.service.IRoleService;
import com.backendshopee.service.IUserService;
@RestController 
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	IUserService iuserservice;
	
	@Autowired
	IRoleService iRoleService;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private JwtProvider jwtProvider;
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping(value = "addUser")
	public UserEntity addUser(@Valid @RequestBody UserEntity model) {
//		String code = bCryptPasswordEncoder.encode(model.getPassword());
//		model.setPassword(code);
		model.setRoles(iRoleService.findByRole("ADMIN"));
		iuserservice.addUser(model);
		return model;
	}
	
//	@PostMapping(value = "login")
//	public UserEntity login(@Valid @RequestBody UserEntity model) {
//		String code = bCryptPasswordEncoder.encode(model.getPassword());
//		model.setPassword(code);
//		model.setRoles(iRoleService.findByRole("ADMIN"));
//		iuserservice.addUser(model);
//		return model;
//	}
	
	@PostMapping(value = "/login")
    public String login(@RequestBody UserEntity userEntity) {
		System.out.print("run");
        return iuserservice.login(userEntity);
    }
	
	@GetMapping(value = "/allUser")
	public List<UserEntity> allUser(){
		return iuserservice.findAll();
	}
	
	@GetMapping(value = "/user")
	public Optional<org.springframework.security.core.userdetails.User> user(Authentication authentication){
		return iuserservice.getCurrentUser();
//		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//		String username = userDetails.getUsername();
//		return username;
		
//		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//		if (principal instanceof UserDetails) {
//		String username = ((UserDetails)principal).getUsername();
//		} else {
//		String username = principal.toString();
//		}
//		
//		return principal;
//		
//		 if (authentication != null)
//	            return authentication.getName();
//	        else
//	            return "";
		
//		User loggedInUser = iuserservice.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("User Not Found"));
//     
//		return loggedInUser.getUsername();
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
	
	@GetMapping(value = "/ak/{id}")
	public String ak(@PathVariable(value = "id") String id){
//		iuserservice.deleteUser(id);
		return jwtProvider.getUsernameFromJWT(id);
	}
}
