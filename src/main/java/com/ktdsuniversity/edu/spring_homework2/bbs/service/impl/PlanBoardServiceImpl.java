package com.ktdsuniversity.edu.spring_homework2.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao;
import com.ktdsuniversity.edu.spring_homework2.bbs.service.PlanBoardService;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.UpdatePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;

@Service
public class PlanBoardServiceImpl implements PlanBoardService{

	@Autowired
	private PlanBoardDao planboardDao;

	@Override
	public boolean createNewPlanBoard(WritePlanBoardVO writePlanBoardVo) {
		int rows = this.planboardDao.insertNewTodo(writePlanBoardVo);
		return rows > 0;
	}

	@Override
	public boolean changeIsDone(UpdatePlanBoardVO updatePlanBoardVO) {
		int rows = this.planboardDao.updateIsDone(updatePlanBoardVO);
		return rows > 0;
	}

	@Override
	public boolean removeOnePlanBoard(UpdatePlanBoardVO updatePlanBoardVO) {
		int rows = this.planboardDao.deleteTodo(updatePlanBoardVO);
		return rows > 0;
	}

	@Override
	public List<PlanBoardVO> getAllPlanBoard(MemberVO memberVO) {
		List<PlanBoardVO> planBoardVo = this.planboardDao.selectAllPlanBoard(memberVO);
		return planBoardVo;
	}
	
	
}
