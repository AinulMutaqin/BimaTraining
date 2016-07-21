package com.bimapalma.day6;

public class Dog extends Animal {
	public Dog() {
		super("mamalia");
		//super(); diselipkan oleh compiler
		System.out.println("Dog is animal");
	}
	
	public Dog(String dogname) {
		super("mamalia");
		System.out.println("This Dog called " +dogname);
	}
}
