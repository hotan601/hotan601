package package1704;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in);
		System.out.print("moi ban nhap so a: ");
		int a = input.nextInt();
		System.out.print("moi ban nhap so b: ");
		int b = input.nextInt();

		System.out.println("Tong la: " +(a+b));
		System.out.println("Hieu la: " +(a-b)); 
		System.out.println("Phep chia lay du : " +(a%b));
		System.out.println("Thuong la: " + (a/b));
		System.out.println("a++ la: " +(++a));
		System.out.println("b-- la: " +(--b));
		//System.out.println(check);
	
	}
	public static String check(int a, int b) {
		if (a > b) {
			return (a + " > " +b);
		}
		return (a + " < " +b);
		
		// return (a>b) ? "a > b" : "a < b";
		}
	

}
