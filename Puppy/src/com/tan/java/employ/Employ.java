package com.tan.java.employ;

public class Employ {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	public Job job;
	
	public Employ(String name, int id, double salary, int age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
				
	}
	
	public String show() {
		return id + " "+name + " " +salary  +" "+ age +  " " +job.name;
	}
	
	
	
}
