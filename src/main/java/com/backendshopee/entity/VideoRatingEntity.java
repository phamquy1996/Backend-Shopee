package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VideoRating")
public class VideoRatingEntity extends ParentEntity {
	@Column(name = "video")
	private String video;
	
	@Column(name = "rating_id")
	private Number rating_id;

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Number getRating_id() {
		return rating_id;
	}

	public void setRating_id(Number rating_id) {
		this.rating_id = rating_id;
	}
}
