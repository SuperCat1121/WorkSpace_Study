package com.test01;

import com.test02.MethodTest01;

public class MethodTest02 {

	// public : 접근제한자. 어디서나 접근/참조 가능
	// static : memory 영역. static area, java application 실행 -> 종료(memory 회수) 까지 살아있음
	// void : return type. return 할 값이 없으면 void
	// main : 메소드 이름. public static void main(String[] args) -> 프로그램의 주 진입점
	// argument : 메소드 외부에서 전달되는 값
	// parameter : 전달된 값을 내부에서 사용하기 위한 변수
	public static void main(String[] args) {
		MethodTest01 mt01 = new MethodTest01();
		mt01.publicMethod();
		// mt01.protectedMethod();
		// mt01.defaultMethod();
		// mt01.privateMethod();
	}

}
