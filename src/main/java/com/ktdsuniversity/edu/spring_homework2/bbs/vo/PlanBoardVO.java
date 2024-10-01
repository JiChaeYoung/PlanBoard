package com.ktdsuniversity.edu.spring_homework2.bbs.vo;

public class PlanBoardVO {
	private int id;
	private String deadLine;
	private String subject;
	private String isdone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(String deadline) {
		this.deadLine = deadline;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getIsdone() {
		return isdone;
	}
	public void setIsdone(String isdone) {
		this.isdone = isdone;
	}
}
