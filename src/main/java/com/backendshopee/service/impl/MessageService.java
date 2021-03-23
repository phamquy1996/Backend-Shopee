package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public boolean addMessage(MessageEntity messageEntity) {
		// TODO Auto-generated method stub
		System.out.print(messageEntity.getSender() + messageEntity.getReceiver());
		List<RoomChatEntity> rooms = (List<RoomChatEntity>) iRoomChatService.findByUserNam1AndUserName2(messageEntity.getSender(), messageEntity.getReceiver());
		
		MessageEntity message = new MessageEntity();
		if(rooms.isEmpty()) {
			List<RoomChatEntity> rooms1 = (List<RoomChatEntity>) iRoomChatService.findByUserNam1AndUserName2(messageEntity.getReceiver(),messageEntity.getSender());
			message.setRoomChat(rooms1.get(0));
		}else {
			message.setRoomChat(rooms.get(0));
		}
		message.setContent(messageEntity.getContent());
		message.setSender(messageEntity.getSender());
		message.setReceiver(messageEntity.getReceiver());
		messageRepository.save(message);
		return true;
	}

}
