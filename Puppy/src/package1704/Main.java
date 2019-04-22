package package1704;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("moi tban nhap: ");
		String myName = input.next();
		System.out.println("Tex entered: " +myName);
		
		System.out.print("moi ban nhap so thuc: ");
		float myFloat = input.nextFloat();
		System.out.print(myFloat);
	}

}
