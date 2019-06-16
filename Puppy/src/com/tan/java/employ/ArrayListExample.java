package com.tan.java.employ;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
		public static void main(String[] args) {
		//create arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("PHP");
		list.add("JAVA");
		list.add("NET");
		list.add("C++");
		System.out.println(" Name of programming language: ");
		System.out.println(list);
		
	//show list through Iterator
		Iterator<String> it = list.iterator();
		System.out.println("Show list through Iterator: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------");
		//display list through from For: each
		for(String li : list) {
			System.out.println(li);
		}
		
		System.out.println("");
		//show list through index
		int size = list.size();
		for(int i = 0; i < size; i++) {
			System.out.println(list.get(i) );
		}
	}
}
