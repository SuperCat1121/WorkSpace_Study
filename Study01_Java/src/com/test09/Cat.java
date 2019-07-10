package com.test09;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void bite() {
		System.out.println("야옹이가 ");
		super.bite();
	}

}
