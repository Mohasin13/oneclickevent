package com.oneclickevent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "signup", uniqueConstraints = {
		@UniqueConstraint(columnNames = "MOBILE"),
		@UniqueConstraint(columnNames = "ID") })
public class UserSignupModel implements java.io.Serializable {

	private int mobile;
	private String password;
	private boolean verified;
	private int Id;
	
	public UserSignupModel(){
	}
	
	public UserSignupModel(int mobile,String password,boolean verified)
	{
		this.mobile = mobile;
		this.verified = verified;
		this.password = password;
	}
	
	@Column(name = "MOBILE", unique = true, nullable = false, length = 10)
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	@Column(name = "PASSWORD", unique = false, nullable = false, length = 20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "VERIFIED", unique = false, nullable = false)
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
    
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	@Override
	public String toString() {
		return "Signup [mobile =" + mobile + ", password =" + password
				+ ", ID =" + Id + "]";
	}
	
}
