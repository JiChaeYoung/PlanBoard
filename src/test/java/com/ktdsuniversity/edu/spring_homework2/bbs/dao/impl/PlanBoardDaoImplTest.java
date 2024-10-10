package com.ktdsuniversity.edu.spring_homework2.bbs.dao.impl;



import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.ktdsuniversity.edu.spring_homework2.bbs.dao.PlanBoardDao;

@MybatisTest
@Import(PlanBoardDaoImpl.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class PlanBoardDaoImplTest {
	
	@Autowired
	private PlanBoardDao planBoardDao;
	

}
