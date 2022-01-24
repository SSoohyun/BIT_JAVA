package org.global.beans;

import java.util.Date;

public class Members {
	private String userId;
	private String userPwd;
	private String name;
	private String address;
	private Date regDate;
	private String email;
	
	// 기본 생성자
	public Members() {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.address = address;
		this.regDate = regDate;
		this.email = email;
	}
	
	// getter&setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public java.util.Date getRegDate() {
		return regDate;
	}

	public void setRegDate(java.util.Date regDate) {
		this.regDate = regDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
