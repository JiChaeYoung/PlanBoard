package com.ktdsuniversity.edu.spring_homework2.bbs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ktdsuniversity.edu.spring_homework2.bbs.service.PlanBoardService;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;


/**
 * 1. 새로운 할 일을 등록하는 것
 * 2. 완료버튼을 통해 상태를 업데이트하는 것
 * 3. 삭제 버튼을 눌러서 할 일을 지우는 것
 * 4. 모든 작업 확인하기 
 */
@Controller
public class PlanBoardController {
	
	@Autowired
	private PlanBoardService planBoardService;
	
	// 4. 모든 작업 확인하기 
	@GetMapping("/planboard/list")
	public String viewBoardList(Model model,
						@SessionAttribute(value = "_LOGIN_USER_" , required = false)MemberVO memberVO) {
		if(memberVO==null) {
			return "redirect:/member/login";
		}
		List<PlanBoardVO> planboardlist = this.planBoardService.getAllPlanBoard(memberVO);
		model.addAttribute("planboardlist",planboardlist);
		return "planboard/list";
	}
	@GetMapping("/planboard/write")
	public String viewPlanBoardWritePage(@SessionAttribute(value="_LOGIN_USER_", required = false)MemberVO memberVO) {
		if(memberVO == null) {
			return "redirect:/member/login";
		}
		return "planboard/writepage";
	}
	// 1. 새로운 할 일을 등록하는 것
	@PostMapping("/planboard/write")
	public String writePlanBoard(WritePlanBoardVO writePlanBoardVo,
								@SessionAttribute(value="_LOGIN_USER_", required = false)MemberVO memberVO) {
		writePlanBoardVo.setEmail(memberVO.getEmail());
		this.planBoardService.createNewPlanBoard(writePlanBoardVo);
		return "redirect:/planboard/list";
	}
	// 2. 완료버튼을 통해 상태를 업데이트하는 것
	@GetMapping("/planboard/isdone/{id}")
	public String changeIsDoneState(@PathVariable int id) {
		this.planBoardService.changeIsDone(id);
		return "redirect:/planboard/list";
	}
	
	@GetMapping("/planboard/delete/{id}")
	public String removeOnePlanBoard(@PathVariable int id) {
		this.planBoardService.removeOnePlanBoard(id);
		return "redirect:/planboard/list";
	}
}
