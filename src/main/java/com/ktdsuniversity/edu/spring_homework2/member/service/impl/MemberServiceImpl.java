package com.ktdsuniversity.edu.spring_homework2.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.spring_homework2.common.beans.Sha;
import com.ktdsuniversity.edu.spring_homework2.member.dao.MemberDao;
import com.ktdsuniversity.edu.spring_homework2.member.service.MemberService;
import com.ktdsuniversity.edu.spring_homework2.member.vo.LoginMemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.RegistMemberVO;



@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private Sha sha;
	@Autowired
	private MemberDao memberDao;

	@Override
	public boolean createNewMember(RegistMemberVO registMemberVO) {
		int selectRows = this.memberDao.selectEmailCount(registMemberVO.getEmail());
		if(selectRows > 0) {
			throw new IllegalArgumentException("이메일이 이미 사용중입니다.");
		}
		String salt = sha.generateSalt();
		String password = registMemberVO.getPassword();
		String encrypassword = sha.getEncrypt(password, salt);
		registMemberVO.setPassword(encrypassword);
		registMemberVO.setSalt(salt);
		
		int insertRows = this.memberDao.insertNewMember(registMemberVO);
		return insertRows > 0;
	}

	@Override
	public boolean checkAvailableEmail(String email) {
		int row = this.memberDao.selectEmailCount(email);
		return row == 0;
	}

	@Override
	public MemberVO readMember(LoginMemberVO loginMemberVO) {
		String salt = this.memberDao.selectSalt(loginMemberVO.getEmail());
		if(salt == null) {
			throw new IllegalArgumentException("이메일 또는 비밀번호가 일치하지 않습니다.");
		}
		String password = sha.getEncrypt(loginMemberVO.getPassword(), salt);
		loginMemberVO.setPassword(password);
		
		MemberVO memberVO= this.memberDao.selectOneMember(loginMemberVO);
		if(memberVO == null) {
			throw new IllegalArgumentException("이메일 또는 비밀번호가 일치하지 않습니다.");
		}
		
		return memberVO;
	}
	

	

}
