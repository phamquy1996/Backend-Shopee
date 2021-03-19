package com.backendshopee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.user.SimpUser;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messager")
public class MessageController {
	private SimpUserRegistry userRegistry;


	@Autowired
	public MessageController(SimpUserRegistry userRegistry) {
		this.userRegistry = userRegistry;
	}


	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public List<String> listUsers() {
		List<String> result = new ArrayList<>();
		for (SimpUser user : this.userRegistry.getUsers()) {
			result.add(user.toString());
		}
		return result;
	}
}
