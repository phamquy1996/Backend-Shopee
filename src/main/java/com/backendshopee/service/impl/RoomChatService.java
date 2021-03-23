package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.RoomChatEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.RoomChatRepository;
import com.backendshopee.service.IRoomChatService;
import com.backendshopee.service.IUserService;

@Service
public class RoomChatService implements IRoomChatService{

	@Autowired 
	RoomChatRepository roomChatRepository;
	
	@Autowired 
	IUserService iUserService;
	
	@Override
	public boolean addRoom(Long id) {
		// TODO Auto-generated method stub
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
		 username = ((UserDetails)principal).getUsername();
		} else {
		 username = principal.toString();
		}
		if(id == 0) {
			return true;
		}else {
			UserEntity userSaler = iUserService.findById(id);
			UserEntity userBuyer = iUserService.findByName(username);
			List<RoomChatEntity> roomChatEntity =  roomChatRepository.findByUserName1AndUserName2(userSaler.getName(), userBuyer.getName());
			if(roomChatEntity.isEmpty()) {
				RoomChatEntity room = new RoomChatEntity();
				room.setUserName1(userSaler.getName());
				room.setUserName2(userBuyer.getName());
				roomChatRepository.save(room);
				return true;
			}
			return false;
		}
	}

	@Override
	public List<RoomChatEntity> allRoom() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------vao dc ");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
		 username = ((UserDetails)principal).getUsername();
		} else {
		 username = principal.toString();
		}
		System.out.println(username);
		return roomChatRepository.findByUserName1(username);
	}

	@Override
	public List<RoomChatEntity> findByUserNam1AndUserName2(String username1, String username2) {
		// TODO Auto-generated method stub
		List<RoomChatEntity> listRoom = roomChatRepository.findByUserName1AndUserName2(username1,username2);
		return listRoom;
	}

	@Override
	public RoomChatEntity findById(Long id) {
		// TODO Auto-generated method stub
		return roomChatRepository.findById(id).get();
	}

}
