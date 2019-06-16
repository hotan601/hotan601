package com.tan.Shape.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle("DO",20,30);
		Shape triangle = new Triangle("TIM",5,10);
		
		System.out.println("Dien tich triangle: " + triangle.getArea());
		System.out.println("Color of triangle: " + triangle.toString());
		
		System.out.println("Dien tich rectangle: " + rectangle.getArea());
		System.out.println("Color of rectangle: " + rectangle.toString());
	}

}
