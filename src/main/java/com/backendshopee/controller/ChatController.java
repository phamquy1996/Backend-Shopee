package com.backendshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.RoomChatEntity;
import com.backendshopee.service.IRoomChatService;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {
	
	@Autowired
	IRoomChatService iRoomChatService;
	
	@GetMapping("/addRoom/{id}")
	public List<CategoryEntity> addCate(@PathVariable(value = "id") Long id){
		iRoomChatService.addRoom(id);
		return null;
	}
	
	@GetMapping("/allRoom")
	public List<RoomChatEntity> allRoom(){
		return iRoomChatService.allRoom();
	}
}
