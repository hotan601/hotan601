package package1704;

import java.util.Scanner;

public class MainSwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("nhap n: ");
		int n = input1.nextInt();
		System.out.println("so n: " +n);
	
		switch(n) {
		case 1:
			System.out.println("Create employee");
			break;
		case 2:
			System.out.println("Show the existing employee");
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("moi ban nhap cho dung");
		}
	}

}
