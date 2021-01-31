package com.backendshopee.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.backendshopee.entity.MessageEntity;

@Controller
public class SocketController {

	@MessageMapping("/chat.register")
	@SendTo("/topic/pubic")
	public MessageEntity register(@Payload MessageEntity chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		System.out.println("handling send message: ");
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}

	@MessageMapping("/chat.send")
	@SendTo("/topic/pubic")
	public MessageEntity sendMessage(@Payload MessageEntity chatMessage) {
		System.out.println("handling send message: ");
		return chatMessage;
	}

}