package com.ktdsuniversity.edu.spring_homework2.member.vo;

public class MemberVO {
	private String email;
	private String name;
	private String password;
	private String salt;
	private String loginFailCount;
	private String latestLoginFailDate;
	private String latestLoginIp;
	public String getLoginFailCount() {
		return loginFailCount;
	}
	public void setLoginFailCount(String loginFailCount) {
		this.loginFailCount = loginFailCount;
	}
	public String getLatestLoginFailDate() {
		return latestLoginFailDate;
	}
	public void setLatestLoginFailDate(String latestLoginFailDate) {
		this.latestLoginFailDate = latestLoginFailDate;
	}
	public String getLatestLoginIp() {
		return latestLoginIp;
	}
	public void setLatestLoginIp(String latestLoginIp) {
		this.latestLoginIp = latestLoginIp;
	}
	public String getLatestLoginSuccessDate() {
		return latestLoginSuccessDate;
	}
	public void setLatestLoginSuccessDate(String latestLoginSuccessDate) {
		this.latestLoginSuccessDate = latestLoginSuccessDate;
	}
	private String latestLoginSuccessDate;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
}
