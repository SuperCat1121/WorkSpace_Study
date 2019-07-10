package com.test08;

public class Dog implements Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

	@Override
	public void bite() {
		System.out.println("멍멍이가 울었다");
	}

}
