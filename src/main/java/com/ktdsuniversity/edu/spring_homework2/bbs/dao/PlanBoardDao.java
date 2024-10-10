package com.ktdsuniversity.edu.spring_homework2.bbs.dao;

import java.util.List;

import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;

/**
 * 1. 새로운 할 일을 등록하는 것
 * 2. 완료버튼을 통해 상태를 업데이트하는 것
 * 3. 삭제 버튼을 눌러서 할 일을 지우는 것
 */
public interface PlanBoardDao {
	public List<PlanBoardVO> selectAllPlanBoard(MemberVO memberVO);
	public int insertNewTodo(WritePlanBoardVO writePlanBoardVo);
	public int updateIsDone(int id);
	public int deleteTodo(int id);
}
