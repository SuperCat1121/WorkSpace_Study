package com.db02.dto;

public class StudyDto {

	private int no;
	private String name;
	private String loc;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public StudyDto() {}
	public StudyDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	
}
