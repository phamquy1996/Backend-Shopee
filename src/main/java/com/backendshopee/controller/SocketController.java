package com.backendshopee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.backendshopee.entity.MessageEntity;

@Controller
public class SocketController {

	private static final Logger log = LoggerFactory.getLogger(SocketController.class);
	
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
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/sendPrivateMessage")
	//@SendTo("/queue/reply")
	public void sendPrivateMessage(@Payload MessageEntity chatMessage) {
		simpMessagingTemplate.convertAndSendToUser(
				chatMessage.getReceiver().trim(), "/reply", chatMessage); 
		//return chatMessage;
	}

	@MessageMapping("/addPrivateUser")
	@SendTo("/queue/reply")
	public MessageEntity addPrivateUser(@Payload MessageEntity chatMessage,
			SimpMessageHeaderAccessor headerAccessor) {
		// Add user in web socket session
//		System.out.print(headerAccessor.getSessionAttributes());
		headerAccessor.getSessionAttributes().put("private-username", chatMessage.getSender());
		System.out.print(headerAccessor.getSessionAttributes().get("username"));
		return chatMessage;
	}

}