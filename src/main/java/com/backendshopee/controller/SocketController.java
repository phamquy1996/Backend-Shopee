package com.backendshopee.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.backendshopee.entity.MessageEntity;
@CrossOrigin(origins = "http://localhost:3001")
@Controller
public class SocketController {

	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public MessageEntity register(@Payload MessageEntity chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}

	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public MessageEntity sendMessage(@Payload MessageEntity chatMessage) {
		return chatMessage;
	}

}