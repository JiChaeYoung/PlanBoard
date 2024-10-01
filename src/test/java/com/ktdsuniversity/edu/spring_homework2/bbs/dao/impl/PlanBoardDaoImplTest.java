package com.ktdsuniversity.edu.spring_homework2.bbs.dao.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.PlanBoardVO;
import com.ktdsuniversity.edu.spring_homework2.bbs.vo.WritePlanBoardVO;

@MybatisTest
@Import(PlanBoardDaoImpl.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class PlanBoardDaoImplTest {
	
	@Autowired
	private PlanBoardDao planBoardDao;
	
	@Test
	public void createNewPlan() {
		WritePlanBoardVO writeBoardVo = new WritePlanBoardVO();
		writeBoardVo.setSubject("test");
		writeBoardVo.setSubject("20251010");
		
		int rows = this.planBoardDao.insertNewTodo(writeBoardVo);
		assertEquals(1,rows);
	}
	
	@Test
	public void doneTodo() {
		int rows = this.planBoardDao.updateIsDone(5);
		
		assertEquals(1, rows);
	}
	
	@Test
	public void removeBoard() {
		int rows = this.planBoardDao.deleteTodo(5);
		assertEquals(1, rows);
	}
	@Test
	public void selectAllPlanBoard() {
		List<PlanBoardVO> planboardlist = this.planBoardDao.selectAllPlanBoard();
		for(PlanBoardVO pb:planboardlist) {
			System.out.println("pb"+pb.getSubject());
			System.out.println("pb"+pb.getDeadLine());
			System.out.println("pb"+pb.getId());
			System.out.println("pb"+pb.getIsdone());
		}
	}

}
