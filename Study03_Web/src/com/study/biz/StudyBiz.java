package com.study.biz;

import java.util.List;

import com.study.dto.StudyDto;

public interface StudyBiz {

	public List<StudyDto> selectList();
	public StudyDto selectOne(int no);
	public int insert(StudyDto dto);
	public int update(StudyDto dto);
	public int delete(int no);
	
}
