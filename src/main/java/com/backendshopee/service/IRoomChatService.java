package com.backendshopee.service;

import java.util.List;

import com.backendshopee.entity.RoomChatEntity;

public interface IRoomChatService {
	public boolean addRoom(Long id);
	public List<RoomChatEntity> allRoom();
	public RoomChatEntity findById(Long id);
	List<RoomChatEntity> findByUserNam1AndUserName2(String username1, String username2);

}
