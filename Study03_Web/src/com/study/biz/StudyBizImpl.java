package com.study.biz;

import java.util.List;

import com.study.dao.StudyDao;
import com.study.dao.StudyDaoImpl;
import com.study.dto.StudyDto;

public class StudyBizImpl implements StudyBiz {

	private StudyDao dao = new StudyDaoImpl();
	
	@Override
	public List<StudyDto> selectList() {
		return dao.selectList();
	}

	@Override
	public StudyDto selectOne(int no) {
		return dao.selectOne(no);
	}

	@Override
	public int insert(StudyDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(StudyDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int no) {
		return dao.delete(no);
	}

}
