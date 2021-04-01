package project;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Member {
	private String username;
	private String password;
	private String name;
	private String phone;
	
	public Member() {
	
	}
	
	public Member(String username, String password, String name, String phone) {	
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}

