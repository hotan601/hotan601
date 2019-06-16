package com.tan.Animal.java;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Lu",6,"dog");
		System.out.println("Name of "  + dog.getTypeName()+ ": " +dog.getName());
		System.out.println("Age of " + dog.getTypeName() + ": "  +dog.getAge());
		
		Tiger tiger = new Tiger("Kaka", 7,"tiger");
		System.out.println("Name of " +tiger.getTypeName() +": " +tiger.getName());
		System.out.println("Age of " +tiger.getTypeName() + ": " +tiger.getAge());
	}

}
