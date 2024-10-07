package com.ktdsuniversity.edu.spring_homework2.member.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ktdsuniversity.edu.spring_homework2.member.service.MemberService;
import com.ktdsuniversity.edu.spring_homework2.member.vo.LoginMemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.RegistMemberVO;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
public class MemberController {
	@Autowired
	private MemberService memberSerivce;
	
	@GetMapping("/member/regist")
	public String registMemberPage() {
		return "member/registMember";
	}
	@PostMapping("/member/regist")
	public String doRegistMember(@Valid RegistMemberVO registMemberVO, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("registMemberVO", registMemberVO);
			return "member/registMember";
		}
		if(!(registMemberVO.getPassword().equals(registMemberVO.getPasswordConfirm()))) {
			model.addAttribute("error_string", "비밀번호가 일치하지 않습니다");
			return "member/registMember";
		}
		boolean isCreated = this.memberSerivce.createNewMember(registMemberVO);
		
		if(!isCreated) {
			return "member/registMember";
		}
		
		return "redirect:/member/login";
	}
	
	@ResponseBody
	@GetMapping("/member/regist/available")
	public Map<String, Object> doCheckAvailableEmail(@RequestParam String email){
		boolean isAvailableEmail = this.memberSerivce.checkAvailableEmail(email);
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("email", email);
		response.put("available", isAvailableEmail);
		
		return response;
	}
	@GetMapping("/member/login")
	public String viewLoginpage() {
		return "member/memberlogin";
	}
	@PostMapping("/member/login")
	public String doLogin(@Valid LoginMemberVO loginMemberVO
							, BindingResult bindingResult
							, HttpSession session
							, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("loginMemberVO", loginMemberVO);
			return "member/memberlogin";
		}
		try {
			MemberVO memberVO= this.memberSerivce.readMember(loginMemberVO);
			session.setAttribute("_LOGIN_USER_", memberVO);
		}
		catch(IllegalArgumentException iae) {
			model.addAttribute("loginMemberVO", loginMemberVO);
			model.addAttribute("message",iae.getMessage());
			return "member/memberlogin";
			
		}
		
		return "redirect:/planboard/list";
	}
	
}
