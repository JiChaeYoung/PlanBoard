package com.ktdsuniversity.edu.spring_homework2.bbs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.UpdatePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.member.vo.MemberVO;

@Repository
public class PlanBoardDaoImpl extends SqlSessionDaoSupport implements PlanBoardDao{

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	@Override
	public int insertNewTodo(WritePlanBoardVO writePlanBoardVo) {
		return this.getSqlSession()
				.insert("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.insertNewTodo", writePlanBoardVo);
	}

	@Override
	public int updateIsDone(UpdatePlanBoardVO updatePlanBoardVO) {
		return this.getSqlSession()
				.update("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.updateIsDone", updatePlanBoardVO);
	}

	@Override
	public int deleteTodo(UpdatePlanBoardVO updatePlanBoardVO) {
		return this.getSqlSession()
				.delete("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.deleteTodo", updatePlanBoardVO);
	}
	@Override
	public List<PlanBoardVO> selectAllPlanBoard(MemberVO memberVO) {
		return this.getSqlSession()
				.selectList("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.selectAllPlanBoard", memberVO);
	}

}
