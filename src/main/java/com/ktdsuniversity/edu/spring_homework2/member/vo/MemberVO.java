package com.ktdsuniversity.edu.spring_homework2.member.vo;

public class MemberVO {
	private String email;
	private String name;
	private String password;
	private String salt;
	private String login_fail_count;
	private String latest_login_fail_date;
	private String latest_login_ip;
	private String latest_login_success_date;
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
	public String getLogin_fail_count() {
		return login_fail_count;
	}
	public void setLogin_fail_count(String login_fail_count) {
		this.login_fail_count = login_fail_count;
	}
	public String getLatest_login_fail_date() {
		return latest_login_fail_date;
	}
	public void setLatest_login_fail_date(String latest_login_fail_date) {
		this.latest_login_fail_date = latest_login_fail_date;
	}
	public String getLatest_login_ip() {
		return latest_login_ip;
	}
	public void setLatest_login_ip(String latest_login_ip) {
		this.latest_login_ip = latest_login_ip;
	}
	public String getLatest_login_success_date() {
		return latest_login_success_date;
	}
	public void setLatest_login_success_date(String latest_login_success_date) {
		this.latest_login_success_date = latest_login_success_date;
	}
	
}
