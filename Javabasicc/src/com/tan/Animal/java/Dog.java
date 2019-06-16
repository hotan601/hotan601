package com.tan.Animal.java;

public class Dog extends Animal{
	public String typeName;
	
	public Dog(String name, int age,String typeName ) {
	super(name,age);
	this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
