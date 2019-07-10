package com.test01;

public class MTest {

	public static void main(String[] args) {
		// java = Object Oriented Programming language
		// 타입 변수 = 값;
		// 타입 -> 기본 / 참조
		
		System.out.println("java의 기본타입 : call by value");
		System.out.println("정수형");
		// byte short int long
		byte b1 = 0;
		short s1 = 1;
		int i1 = 2;
		long l1 = 3l;
		
		byte b2 = 1;
		byte sum1 = (byte)(b1 + b2);
		
		System.out.println("실수형");
		// float double
		float f1 = 4f;
		double d1 = 8;
		
		System.out.println("문자형");
		// char
		char c1 = ' ';
		
		System.out.println("논리형");
		// boolean
		boolean b = true;
		
		System.out.println("---------------------------------");
		
		System.out.println("참조타입 : call by reference - (Object를 상속받는) 모든 class");
		System.out.println("기본타입 -> 참조타입 : wrapper class");
		/*
			byte     ->   Byte
			short    ->   Short
			int      ->   Integer
			long     ->   Long
			float    ->   Float
			double   ->   Double
			char     ->   Character
			boolean  ->   Boolean
		 */
		
		System.out.println("String : 문자열 - immutable");
		String a = "abc";
		String b3 = "abc";
		String c = new String("abc");
		
		System.out.println(a == b3);      // true
		System.out.println(a == c);       // false
		System.out.println(a.equals(b3)); // true
		System.out.println(a.equals(c));  // true
		
		System.out.println(a + "def");
		System.out.println(a);
		a = a + "def";
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer();
		sb.append("mutable");
		System.out.println(sb);
		sb.append("!!!");
		System.out.println(sb);
		
	}

}
