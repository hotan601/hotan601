package com.tan.java.employ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//create hashset
		Set<String> set = new HashSet<String>();
		set.add("NGUYEN VAN A");
		set.add("NGUYEN VAN B");
		set.add("NGUYEN VAN C");
		set.add("NGUYEN VAN D");
		
	//Show set through Iterator
		Iterator<String> it= set.iterator();
		System.out.println("Show list: ");
		while(it.hasNext()) {
			System.out.println("\t" +it.next());
		}
		//System.out.println("\n");
		
	//show list through for:each
		System.out.println("Show list name:");
		for(String st : set) {
			System.out.println(st + ",");
		}
	}

}
