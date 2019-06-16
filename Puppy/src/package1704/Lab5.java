package package1704;
import java.util.Scanner;

public class Lab5 {
	public static Scanner input = new Scanner(System.in);
	public static int inputNumber = 0;

	public static void main(String[] args) {
		
		
	}
}


public static void showMenu() {
	//Scanner input = new Scanner(System.in);
	do {
	System.out.println("------ chuong trinh menu ----------");
	System.out.println("1.Create employee");
	System.out.println("2.Show the existing employee");
	System.out.println("3.Exit");
	System.out.println("moi ban nhap 1 so: ");
	int inputNumber = input.nextInt();
		switch(inputNumber) {
		case 1:
			addEmployee();
			break;
		case 2:
			showEmployee();
			break;
		case 3:
			System.out.println("exit");
			break;
		default:
			System.out.println("moi ban nhap cho dung");
			break;
		}
	}
	while(inputNumber <=3);
}

public static void addEmployee(){
	//Scanner input = new Scanner(System.in);
	int employs = input.nextInt();
	employs = new Employ[inputNumber];
	for(int i=0;i<employs.length;i++)
		System.out.print("moi ban nhap id: ");
		int id = input.nextInt();
		System.out.print("moi ban nhap name: ");
		String name= input.next();
	
}

public static void showEmployee() {
	
}

public static void askForCountinue{
	
}