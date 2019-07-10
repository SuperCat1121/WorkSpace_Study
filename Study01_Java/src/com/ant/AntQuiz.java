package com.ant;

public class AntQuiz {

	/*
		1
		1 1
		1 2
		1 1 2 1
		1 2 2 1 1 1
		1 1 2 2 1 3
		1 2 2 2 1 1 3 1
		1 1 2 3 1 2 3 1 1 1
	 */
	public static void main(String[] args) {
		antPrn(10);
	}
	
	public static void antPrn(int stage) {
		String start = "1";
		System.out.println(start);
		for(int i=1;i<stage;i++) {
			start = ant(start);
			System.out.println(start);
		}
	}
	
	public static String ant(String input) {
		// res : 결과값
		String res = "";
		
		// 기준값
		char index = input.charAt(0);
		
		// 카운트
		int cnt = 1;
		
		for(int i=1;i<input.length();i++) {
			if(index == input.charAt(i)) {
				// 같으면 카운트 증가
				cnt++;
			} else {
				// 같지 않으면
				// 1. 결과값 += 기준값 + 카운트
				res = res + index + cnt;
				// 2. 같지 않은 값을 기준값으로 설정
				index = input.charAt(i);
				// 3. 카운트 값 초기화
				cnt = 1;
			}
		}
		// 결과값 += 마지막 기준값 + 카운트
		res = res + index + cnt;
		
		return res;
	}
}




















