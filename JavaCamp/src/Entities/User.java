package Entities;

import Abstract.Entity;

public class User implements Entity{
	private int id;
	private int customerId;
	private String userName;
	private String email;
	private String password;
	
	public User() {
		super();
	}

	public User(int id, int customerId, String userName, String email, String password) {
		this.id = id;
		this.customerId = customerId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
