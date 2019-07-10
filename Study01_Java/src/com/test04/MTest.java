package com.test04;

public class MTest {

	public static void main(String[] args) {
		System.out.println("반복문 : for while");
		test01();
		test02();
		System.out.println("조건문 : if switch");
		test03(4, 7);
		test04(80, 90);
	}
	
	private static void test03(int i, int j) {
		// if를 사용하여 i와 j중 더 큰수를 작은수 제곱하자
		if(i>j) {
			System.out.println(Math.pow(i, j));
		} else {
			System.out.println(Math.pow(j, i));
		}
	}

	private static void test04(int i, int j) {
		// switch를 사용하여 두 수의 평균을 가지고 등급을 출력하자
		// 90~ : A / 80~89 : B ...
		switch (((i+j)/2)/10) {
		case 10:
		case 9:
			System.out.println("등급 A");
			break;
		case 8:
			System.out.println("등급 B");
			break;
		case 7:
			System.out.println("등급 C");
			break;
		case 6:
			System.out.println("등급 D");
			break;
		default:
			System.out.println("등급 F");
			break;
		}
		
	}

	private static void test01() {
		// for 사용해서 1234의 각 자리수를 모두 더하자
		int i = 1234;
		int res = 0;
		for(;i>0;i/=10) {
			int tmp = i%10;
			System.out.println(tmp);
			res += tmp;
		}
		System.out.println(res);
	}
	
	private static void test02() {
		// while 사용해서 4321의 각 자리수를 모두 더하자
		int i = 4321;
		int res = 0;
		while(i>0) {
			int tmp = i%10;
			System.out.println(tmp);
			res += tmp;
			i /= 10;
		}
		System.out.println(res);
	}
}





