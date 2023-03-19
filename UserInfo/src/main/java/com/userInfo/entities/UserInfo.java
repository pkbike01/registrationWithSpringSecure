package com.userInfo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Userid;
	
	@Column(name="user_name",length=32,nullable=false)
	private String userName;
	
	@Column(name="email",length=122,nullable=false,unique=true) 
	private String email;
	
	@Column(name="city",length=32,nullable=false)
	private String city;
	
	@Column(name="mobile",length=10,nullable=false)
	private long mobile;
	public long getUserid() {
		return Userid;
	}
	public void setUserid(long userid) {
		Userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	

}
