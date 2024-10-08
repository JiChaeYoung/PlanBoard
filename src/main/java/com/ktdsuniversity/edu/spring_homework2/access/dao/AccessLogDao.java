package com.ktdsuniversity.edu.spring_homework2.access.dao;

import com.ktdsuniversity.edu.spring_homework2.access.vo.AccessLogVO;

/**
 * 로그 남기는거
 * 로그에서 ip를 통해서 몇번 시도 했는지 알아오기
 */
public interface AccessLogDao {
	public String NAMESPACE = "com.ktdsuniversity.edu.spring_homework2.access.dao.AccessLogDao";
	public int insertNewAccessLog(AccessLogVO AccessLogVO);
	public int selectLoginFailCount(String ip);
}
