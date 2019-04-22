package com.tan.java.employ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job (1, "HR");
		Job job2 = new Job (2, "Develop");
		Job job3 = new Job (3, "CEO");
		Job job4 = new Job (4, "BA");
		//Job job5 = new Job (5,"Tester");
		
		Employ emp1 = new Employ("Nguyen Van A", 1, 1000, 25, true, job1);
		Employ emp2 = new Employ("NGuyen Van B", 2, 1050, 26, true, job2);
		Employ emp3 = new Employ("Nguyen Van C", 3, 1005, 23, false, job3);
		Employ emp4 = new Employ("Nguyen Van D", 4, 1006, 25, true, job4);
		Employ emp5 = new Employ("Nguyen Van E", 5, 1030, 25, true, new Job(5,"BA"));
		
		Employ[] employs = new Employ[5];
		employs[0] = emp1;
		employs[1] = emp2;
		employs[2] = emp3;
		employs[3] = emp4;
		employs[4] = emp5;
		
		System.out.println("ID        NAME            SALARY       AGE      JOBNAME");
		for(int i=0; i<employs.length;i++) {
		System.out.println(employs[i].id+"      "+employs[i].name+"       "+employs[i].salary+"       "+employs[i].age+ "        "+employs[i].job.name);
		}
		
		//System.out.println(emp1.show() );
		
		//System.out.println("ID   NAME   SALARY   AGE   JOBNAME");
		//System.out.println(emp4.id+"    "+emp4.name+"    "+emp4.salary+"   "+emp4.age+ "   "+emp4.job.name);
		
		
	}
	
	

}
