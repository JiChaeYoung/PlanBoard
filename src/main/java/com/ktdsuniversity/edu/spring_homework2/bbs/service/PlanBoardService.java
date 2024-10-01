package com.ktdsuniversity.edu.spring_homework2.bbs.service;

import java.util.List;

import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;

/**
 * 1. 새로운 할 일을 등록하는 것
 * 2. 완료버튼을 통해 상태를 업데이트하는 것
 * 3. 삭제 버튼을 눌러서 할 일을 지우는 것
 */
public interface PlanBoardService {
	public List<PlanBoardVO> getAllPlanBoard();
	public boolean createNewPlanBoard(WritePlanBoardVO writePlanBoardVo);
	public boolean changeIsDone(int id);
	public boolean removeOnePlanBoard(int id);
}
