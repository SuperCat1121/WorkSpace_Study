package com.test09;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");

	}

	@Override
	public void bite() {
		System.out.println("멍멍이가 ");
		super.bite();
	}
}
