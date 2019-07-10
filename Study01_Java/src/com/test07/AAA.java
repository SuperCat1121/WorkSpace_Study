package com.test07;

// class : 설계도 -> instance(객체 : memory에 구현된것)
public class AAA {

	// field : 속성 -> 전역변수
	private String a = "aaa"; // instance 변수
	static String b = "abc";  // class 변수
	
	// constructor : 객체 생성, field 초기화
	public AAA() {
		System.out.println("AAA() 생성");
	}
	public AAA(String a) {
		System.out.println("AAA(a) 생성");
		this.a = a;
	}
	// method
	public void setA(String a) {
		this.a = a;
	}
	public String getA() {
		return a;
	}

}
