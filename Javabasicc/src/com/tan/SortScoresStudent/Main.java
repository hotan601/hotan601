package com.tan.SortScoresStudent;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++ ) {
			student[i] = new Student();
			System.out.println("Please enter your name: " );
			student[i].setName(scanner.nextLine());
			System.out.println("Please enter your age: ");
			student[i].setAge(Integer.parseInt(scanner.nextLine()));// chuyen doi tu string sang int
			System.out.println("Please enter your scores: ");
			student[i].setScores(scanner.nextFloat());
			//scanner.nextLine();
		}
		
		for(int i = 0; i <3; i++) {
			for(int j = i + 1 ; j < 3; j++) 
				if(student[i].getScores() < student[j].getScores()) {
					Student temp = new Student();
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
		}
		System.out.println("----------------------");
		System.out.println("Scores of student after sort from high to low: ");
		for(int i = 0; i < 3; i++) {
			System.out.println("Name of student: " + student[i].getName());
			System.out.println("Age of student: " + student[i].getAge());
			System.out.println("Scores of student: " + student[i].getScores());
		}
	}
}
