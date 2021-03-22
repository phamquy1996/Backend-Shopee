package com.backendshopee.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.api.home.output.HomeOutput;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.IUserService;


@RestController
@RequestMapping("api/v1/home")
public class HomeController {
	@Autowired
	private ICategoryService icategoryservice;
	
	@Autowired
	private IProductService iProductService;
	
	@Autowired
	private IUserService IUserService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@PostMapping(value = "/new")
	public String getAllEmployees(@Valid @RequestBody CategoryEntity model ) {
		icategoryservice.save(model);
		String a = bCryptPasswordEncoder.encode(model.getName());
		return a;
	}
	
	@GetMapping(value = "/all")
	public List<CategoryEntity> getAllCategory(Authentication authentication, Principal principal) {
		List<CategoryEntity> cate = icategoryservice.findAll();
		return cate;
	}
	
	@GetMapping(value = "/eliminar/{id}")
	public Number eliminar(@PathVariable(value = "id") Long id) {
		icategoryservice.delete(id);
		return id;
	}
	
	@GetMapping("/allHome")
	public HomeOutput allHome(Principal principal) {
        System.out.println("-----------------");
        System.out.println(principal.getName());
        System.out.println("-----------------1");
        User loggedInUser = IUserService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        System.out.println(loggedInUser.getUsername());
		HomeOutput homeOutput = new HomeOutput();
		List<CategoryEntity> cates = icategoryservice.findAll();
		List<ProductEntity> products = iProductService.all();
		homeOutput.setCategories(cates);
		homeOutput.setProducts(products);
		return homeOutput;
	}
}
