package com.ktdsuniversity.edu.spring_homework2.member.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegistMemberVO {
	@NotBlank(message = "이메일을 입력해주세요")
	@Email(message = "이메일 형식을 맞춰주세요")
	private String email;
	@NotBlank(message = "이름을 입력해주세요")
	private String name;
	@NotBlank(message = "비밀번호를 입력해주세요")
	@Size(min = 10, message = "비밀번호는 최소 10자리 이상입니다.")
	private String password;
	private String passwordConfirm;
	private String salt;
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
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
}
