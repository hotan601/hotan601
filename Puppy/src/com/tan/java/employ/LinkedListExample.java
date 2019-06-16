package com.tan.java.employ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("JAVA");
		linkedlist.add("PHP");
		linkedlist.add("C++");
		System.out.println("Cac phan tu cua arrayList: ");
		System.out.println(linkedlist +"\n");
		
		linkedlist.addFirst("NET");
		System.out.println("Cac phan tu cua arrayList sau khi them phan tu first: ");
		System.out.println(linkedlist + "\n");
		linkedlist.addLast("PYTHON");
		System.out.println("Cac phan tu cua arrayList sau khi them phan tu Last: " +linkedlist + "\n");
		
		// new TreeSet() se sap xep cac phan tu
		Set<String> set = new HashSet<String>();
		set.add("PYTHON");
		set.add("PHP");
		set.add("C++");
		set.add("C++");
		set.add("JAVA");
		System.out.println("Cac phan tu cua Set: ");
		System.out.println("\t" +set +"\n");
		
		//show set thong qua Interator
//		Iterator<String> it = set.iterator();
//		System.out.println(" Name of programming language: ");
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//new TreeMap() se sap xep cac phan tu dua vao key cua chung
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("windows1", "2000");
		hashMap.put("windows2", "XP");
		hashMap.put("Language1", "Java");
		hashMap.put("Language2", "C++");
		System.out.println("Cac phan tu cua Map: ");
		System.out.println(hashMap);
	}

}
