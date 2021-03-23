package com.backendshopee.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "Message")
public class MessageEntity extends ParentEntity{
	private MessageType type;
	private String sender;
    private String receiver;
    private LocalDateTime dateTime=LocalDateTime.now();
	
	@Column(name = "content")
	private String content;

	@Column(name = "avatar")
	private String avatar = " 0";
	
	@Column(name = "image")
	private String image = " 0";
	
	
	@ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
	private RoomChatEntity roomChat;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        TYPING
    }

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
    
    @JsonIgnore
	public RoomChatEntity getRoomChat() {
		return roomChat;
	}
    
    @JsonIgnore
	public void setRoomChat(RoomChatEntity roomChat) {
		this.roomChat = roomChat;
	}
    
//    public Long getRoom_id(){
//        return roomChat.getId();
//    }
//    
//    public void setRoom_id(RoomChatEntity roomChat) {
//		roomChat.getId();
//	}
}
