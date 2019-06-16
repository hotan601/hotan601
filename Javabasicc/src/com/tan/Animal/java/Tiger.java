package com.tan.Animal.java;

public class Tiger extends Animal{
	private String typeName;
	public Tiger(String name, int age, String typeName) {
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
