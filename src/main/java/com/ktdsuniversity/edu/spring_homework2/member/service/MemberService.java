package com.ktdsuniversity.edu.spring_homework2.member.service;

import com.ktdsuniversity.edu.spring_homework2.member.vo.LoginMemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.RegistMemberVO;

public interface MemberService {

	public boolean createNewMember(RegistMemberVO registMemberVO);

	public boolean checkAvailableEmail(String email);

	public MemberVO readMember(LoginMemberVO loginMemberVO);
}
