package com.ktdsuniversity.edu.spring_homework2.member.dao;

import com.ktdsuniversity.edu.spring_homework2.member.vo.LoginMemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.RegistMemberVO;

/**
 * 회원가입
 * 로그인 (sha 찾아오기 / 멤버 하나 찾아오기)
 */
public interface MemberDao {
	public String NAMESPACE="com.ktdsuniversity.edu.spring_homework2.member.dao.MemberDao";
	public int insertNewMember(RegistMemberVO registMemberVO);
	
	public int selectEmailCount(String email);
	
	public String selectSalt(String email);
	
	public MemberVO selectOneMember(LoginMemberVO loginMemberVO);
}
