package org.ncu.rest_demo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int userId;
	private String userName;
	private String userAddress;
	private int userAge;
	private double userSalary;
	
	public User() {}
	
	public User(int userId, String userName, String userAddress, int userAge, double userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userAge = userAge;
		this.userSalary = userSalary;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public double getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userAge="
				+ userAge + ", userSalary=" + userSalary + "]";
	}
	
}
