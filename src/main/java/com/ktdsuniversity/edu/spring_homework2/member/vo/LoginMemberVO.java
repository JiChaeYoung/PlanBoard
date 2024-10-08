package com.ktdsuniversity.edu.spring_homework2.member.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginMemberVO {
	@NotBlank(message = "이메일을 입력해주세요")
	@Email(message = "이메일 형태로 입력하세요")
	private String email;
	@NotBlank(message = "이메일을 입력해주세요")
	private String password;
	private String ip;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
