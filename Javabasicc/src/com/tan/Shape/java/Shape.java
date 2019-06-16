package com.tan.Shape.java;

public abstract class Shape {
	private String color;
	public Shape(String color) {
		this.color = color;
	} 
	
	public abstract double getArea() ;
		//return 0;
	
	
	public String toString() {
		return " ";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
