package com.ktdsuniversity.edu.spring_homework2.access.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.spring_homework2.access.dao.AccessLogDao;
import com.ktdsuniversity.edu.spring_homework2.access.vo.AccessLogVO;

/*
 * 로그 기록 남기는 거
 * 로그에서 실패한 아이피 찾아오는거
 */
@Repository
public class AccessLogDaoImpl extends SqlSessionDaoSupport implements AccessLogDao{

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int insertNewAccessLog(AccessLogVO AccessLogVO) {
		return this.getSqlSession().insert(NAMESPACE+".insertNewAccessLog", AccessLogVO);
	}

	@Override
	public int selectLoginFailCount(String ip) {
		return this.getSqlSession().selectOne(NAMESPACE+".selectLoginFailCount", ip);
	}
	
	

}
