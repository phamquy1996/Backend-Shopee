package com.backendshopee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/company")
public class HomeController {
	@GetMapping("/employees")
	public Number getAllEmployees(){
		return 23434254;
	}
}
