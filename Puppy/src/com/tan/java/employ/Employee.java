package com.tan.java.employ;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	public Job job;
	
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String show() {
		return id + "     "+name + "    " +salary  +"    "+ age +  "     " +job.name;
	}
	
	
	
}
