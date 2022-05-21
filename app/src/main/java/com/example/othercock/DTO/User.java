package com.example.othercock.DTO;

public class User {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	private String nick;
	private String birth;
	private int stamp;
	private int Tier;

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone=" + phone + ", nick="
				+ nick + ", birth=" + birth + ", stamp=" + stamp + ", Tier=" + Tier + "]";
	}
	public int getTier() {
		return Tier;
	}
	public void setTier(int tier) {
		Tier = tier;
	}
	public int getStamp() {
		return stamp;
	}
	public void setStamp(int stamp) {
		this.stamp = stamp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
