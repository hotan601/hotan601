package com.mista.studentmanagement.main;
import  java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Scanner;

import com.mista.studentmanagement.bo.Student;
import com.mista.studentmanagement.utils.StudentUtils;

public class Main {
	public static ArrayList<Student> list;
	public static void main(String[] args) throws IOException {
		ArrayList <Student> list = new ArrayList<Student>();
			try{ 
					File myObj = new File("StudentInfo.txt"); //open file to read
					Scanner sc = new Scanner(myObj); //read data from file
					while (sc.hasNextLine()) {
						Student student = new Student();
						student.setId(Integer.parseInt(sc.nextLine()));
						student.setFirstName(sc.nextLine());
						student.setLastName(sc.nextLine());
						student.setGender(sc.nextLine());
						student.setAge(Integer.parseInt(sc.nextLine()));
						student.setTelephone(sc.nextLine());
						student.setScores(Integer.parseInt(sc.nextLine()));
						list.add(student);	
					}
					System.out.println(list);
					sc.close();
			}catch(FileNotFoundException e) {
				//System.out.println(" an error occurred.");
				e.printStackTrace();
			}
			
		
		StudentUtils utils = new StudentUtils();
		
		System.out.println("Number of student: " +utils.numberOfStudent(list));
		System.out.println("Percent of gender:"+utils.percentOfGender(list));
		System.out.println("Students not have age:" + utils.studentNullAge(list));
   }
}		


