package package1704;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'C';
		
		switch(grade) {
			case 'A':
				System.out.println("Excellent!");
				break;
			case 'B':
			case 'C':
				System.out.println("Well Done");
				break;
			case 'D':
				System.out.println(" YOu Passed");
				break;
			case 'F':
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid grade");
				break;
		}
		System.out.println("Your grade is: " +grade);
	}

}
