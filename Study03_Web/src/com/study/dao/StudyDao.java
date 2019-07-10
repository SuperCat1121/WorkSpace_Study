
package com.study.dao;
import java.util.List;

import com.study.dto.StudyDto;

public interface StudyDao {

	String SELECT_LIST_SQL = "";
	String SELECT_ONE_SQL = "";
	String INSERT_SQL = "";
	String UPDATE_SQL = "";
	String DELETE_SQL = "";
	
	public List<StudyDto> selectList();
	public StudyDto selectOne(int no);
	public int insert(StudyDto dto);
	public int update(StudyDto dto);
	public int delete(int no);
	
}
