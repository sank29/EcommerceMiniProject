package com.ecommerce.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class CurrentUserSession {
	
	@Id
	private Integer userId;
	
	private String uuid;
	
	private String userType;
	
	private LocalDateTime localDateTime;
	
	public CurrentUserSession() {
		
	}

	

	public CurrentUserSession(Integer userId, String uuid, LocalDateTime localDateTime) {
		super();
		this.userId = userId;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	

}

















