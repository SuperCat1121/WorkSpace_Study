package com.test08;

public class Cat implements Animal {

	@Override
	public void bark() {
		System.out.println("야옹");
	}

	@Override
	public void bite() {
		System.out.println("야옹이가 물었다");
	}

}
