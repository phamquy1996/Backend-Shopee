package com.backendshopee.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
	
	@Column(name = "room_id")
	private Number room_id;
	
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

	public Number getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Number room_id) {
		this.room_id = room_id;
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
}
