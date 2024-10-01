package com.ktdsuniversity.edu.spring_homework2.bbs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;

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
	public int updateIsDone(int id) {
		return this.getSqlSession()
				.update("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.updateIsDone", id);
	}

	@Override
	public int deleteTodo(int id) {
		return this.getSqlSession()
				.delete("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.deleteTodo", id);
	}
	@Override
	public List<PlanBoardVO> selectAllPlanBoard() {
		return this.getSqlSession()
				.selectList("com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao.selectAllPlanBoard");
	}

}
