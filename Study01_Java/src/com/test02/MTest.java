package com.test02;

public class MTest {

	public static void main(String[] args) {
		MethodTest01 mt01 = new MethodTest01();
		System.out.println("접근제한자");
		System.out.println("public : 어디에서나 접근/참조 가능");
		mt01.publicMethod();
		System.out.println("protected : 같은 패키지 내에서 / 상속일 경우엔 받은 곳에서");
		mt01.protectedMethod();
		System.out.println("default : 같은 패키지 내에서");
		mt01.defaultMethod();
		System.out.println("private : 같은 클래스 내에서");
		// mt01.privateMethod(); // not visible : 접근/참조할 범위를 벗어났다. (볼 수 없다)
		// mt01.fridayMethod();  // undefined : 정의되지 않았다 (없다)
	}

}
