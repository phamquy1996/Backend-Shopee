package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.MessageDTO;
import com.backendshopee.entity.MessageEntity;
import com.backendshopee.entity.RoomChatEntity;
import com.backendshopee.repository.MessageRepository;
import com.backendshopee.service.IMessageService;
import com.backendshopee.service.IRoomChatService;

@Service
public class MessageService implements IMessageService{
	
	@Autowired 
	MessageRepository messageRepository;
	
	@Autowired 
	IRoomChatService iRoomChatService;
	
	@Override
	public boolean addMessage(MessageDTO messageDTO) {
		// TODO Auto-generated method stub
		System.out.print(messageDTO.getSender() + messageDTO.getReceiver());
		List<RoomChatEntity> rooms = (List<RoomChatEntity>) iRoomChatService.findByUserNam1AndUserName2(messageDTO.getSender(), messageDTO.getReceiver());
		
		MessageEntity message = new MessageEntity();
		if(rooms.isEmpty()) {
			List<RoomChatEntity> rooms1 = (List<RoomChatEntity>) iRoomChatService.findByUserNam1AndUserName2(messageDTO.getReceiver(),messageDTO.getSender());
			message.setRoomChat(rooms1.get(0));
		}else {
			message.setRoomChat(rooms.get(0));
		}
		message.setContent(messageDTO.getContent());
		message.setSender(messageDTO.getSender());
		message.setIsRead(0);
		message.setReceiver(messageDTO.getReceiver());
		messageRepository.save(message);
		return true;
	}

}
