package com.db02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db02.common.JDBCTemplate;
import com.db02.dto.StudyDto;

public class StudyDao extends JDBCTemplate {
	
	public List<StudyDto> selectList() {
		// 1. driver 연결
		// 2. 계정 연결
		// 3. query 준비
		// 4. query 실행 및 리턴
		// 5. db종료
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		List<StudyDto> list = new ArrayList<StudyDto>();
		ResultSet rs = null;
		String sql = "SELECT NO, NAME, LOC FROM STUDYTABLE ORDER BY NO DESC";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StudyDto dto = new StudyDto(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public StudyDto selectOne(int no) {
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT NO, NAME, LOC FROM STUDYTABLE WHERE NO=?";
		StudyDto dto = new StudyDto();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto.setNo(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setLoc(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return dto;
	}
	
	public int insert(StudyDto dto) {
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO STUDYTABLE VALUES (STUDYSEQ.NEXTVAL,?,?)";
		int res = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getLoc());
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		
		return res;
	}
	
	public int update(StudyDto dto){
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE STUDYTABLE SET NAME=?, LOC=? WHERE NO=?";
		int res = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getNo());
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		
		return res;
	}
	
	public int delete(int no){
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM STUDYTABLE WHERE NO=?";
		int res = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		
		return res;
	}
	
}
