package com.db02.biz;

import java.util.List;

import com.db02.dao.StudyDao;
import com.db02.dto.StudyDto;

public class StudyBiz {

	StudyDao dao = new StudyDao();
	
	public List<StudyDto> selectList() {
		return dao.selectList();
	}
	
	public StudyDto selectOne(int no) {
		return dao.selectOne(no);
	}
	
	public int insert(StudyDto dto) {
		return dao.insert(dto);
	}
	
	public int update(StudyDto dto){
		return dao.update(dto);
	}
	
	public int delete(int no){
		return dao.delete(no);
	}
	
}
