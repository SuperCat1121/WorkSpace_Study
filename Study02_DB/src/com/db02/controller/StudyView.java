package com.db02.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db02.biz.StudyBiz;
import com.db02.dto.StudyDto;

public class StudyView {

	static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		// 1. 전체출력
		// 2. 선택출력
		// 3. 추가
		// 4. 수정
		// 5. 삭제
		// 6. 종료
		System.out.println("1. 전체출력 2. 선택출력 3. 추가 4. 수정 5. 삭제 6. 종료");
		int order = sc.nextInt();

		return order;
	}
	
	public static void main(String[] args) {
		StudyBiz biz = new StudyBiz();
		
		while(true) {
			int order = getMenu();
			if(order < 0 || order > 6) {
				System.out.println("1 ~ 6 사이의 수만 입력하세요!!");
			} else if(order == 1) {
				List<StudyDto> list = new ArrayList<StudyDto>();
				list = biz.selectList();
				for(StudyDto dto : list) {
					System.out.println("번호 : " + dto.getNo());
					System.out.println("이름 : " + dto.getName());
					System.out.println("주소 : " + dto.getLoc());
				}
			} else if(order == 2) {
				System.out.println("조회할 번호를 입력하세요 : ");
				int no = sc.nextInt();
				StudyDto dto = biz.selectOne(no);
				if(dto.getName() == null) {
					System.out.println("조회에 실패했습니다");
					break;
				} else {
					System.out.println(no + "번 조회 결과 : ");
					System.out.println(dto.getName());
					System.out.println(dto.getLoc());
				}
			} else if(order == 3) {
				StudyDto dto = new StudyDto();
				System.out.println("추가할 사람의 이름 입력 : ");
				String name = sc.next();
				System.out.println("추가할 사람의 주소 입력 : ");
				String loc = sc.next();
				dto.setName(name);
				dto.setLoc(loc);
				int res = biz.insert(dto);
				if(res > 0) {
					System.out.println("추가 완료");
				} else {
					System.out.println("추가 실패");
					break;
				}
			} else if(order == 4) {
				StudyDto dto = new StudyDto();
				System.out.println("수정할 사람의 번호 입력 : ");
				int no = sc.nextInt();
				System.out.println("수정할 이름 입력 : ");
				String name = sc.next();
				System.out.println("수정할 주소 입력 : ");
				String loc = sc.next();
				dto.setNo(no);
				dto.setName(name);
				dto.setLoc(loc);
				int res = biz.update(dto);
				if(res > 0) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
					break;
				}
			} else if(order == 5) {
				System.out.println("삭제할 사람의 번호 입력 : ");
				int no = sc.nextInt();
				int res = biz.delete(no);
				if(res > 0) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
					break;
				}
			} else if(order == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
