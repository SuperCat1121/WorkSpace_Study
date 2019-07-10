package com.test07;

public class BBB extends AAA {

	private String b = "abcdef";
	
	public BBB() {
		System.out.println("BBB() 생성");
	}
	public BBB(String a) {
		super(a);
		System.out.println("BBB(a) 생성");
	}
	public BBB(String a, String b) {
		super(a);
		this.b = b;
		System.out.println("BBB(a,b) 생성");
	}
	
	public void setB(String b) {
		this.b = b;
	}
	public String getB() {
		return this.b;
	}
	public String prn() {
		return super.getA() + " : " + this.b + "(" + AAA.b + ")";
	}
}
