package com.mista.studentmanagement.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.mista.studentmanagement.bo.Student;



public class StudentUtils {
	
	
	
	public int numberOfStudent(ArrayList<Student> list) throws IOException  {
		int count = 0;
		
		for(int i=0;i<list.size();i++) {
			
			count++;
		}
		return count;
	}
	
	public String percentOfGender(ArrayList<Student>list) {
		float countMale = 0;
		float countFemale = 0;
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			if(((Student) it).getGender().equals("Male")) {
				countMale++;
			}
			else {
				countFemale++;
			}	
		}
			float count = 0;
			float male = (countMale/count)*100;
			float female = (countFemale/count)*100;
		
		String percent = String.valueOf(male) + "/" + String.valueOf(female);
		return percent;
	}
	
//	public static boolean checkAge(ArrayList<Student>list) {
//		for (int i = 0; i< list.size(); i++) {
//			if(list.get(i).getAge() == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	public ArrayList<Student> studentNullAge(ArrayList<Student>list) {
		ArrayList<Student> listNotAge = new ArrayList<Student>();
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getAge() == 0) {
				listNotAge.add(list.get(i));
			}
		}
		return listNotAge;
	}
	
}
