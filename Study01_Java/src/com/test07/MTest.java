package com.test07;

public class MTest {
	
	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setA("가나다");
		b1.setB("라마바");
		System.out.println(b1.prn());
		
		BBB b2 = new BBB("사자");
		b2.setB("차카타");
		System.out.println(b2.prn());
		
		BBB b3 = new BBB("파","하");
		System.out.println(b3.prn());
	}
}
