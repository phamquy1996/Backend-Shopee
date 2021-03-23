package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "RoomChat")
public class RoomChatEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "UserName1")
	private String UserName1;
	
	@Column(name = "UserName2")
	private String UserName2;
	
	@OneToMany(mappedBy = "roomChat", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MessageEntity> messages = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName1() {
		return UserName1;
	}

	public void setUserName1(String userName1) {
		UserName1 = userName1;
	}
	
	public String getUserName2() {
		return UserName2;
	}

	public void setUserName2(String userName2) {
		UserName2 = userName2;
	}
	
	public List<MessageEntity> getMessages() {
		return messages;
	}
	
	public void setMessages(List<MessageEntity> messages) {
		this.messages = messages;
	}
	
}
