package Package13;

public class Mainn {
	public static void main(String[] args) {
		Student sv1 = new Student();
		sv1.name = "Dave";
		sv1.age = 6;
		sv1.gender = "boy";
		System.out.println(" sinh vien 1: " + sv1.name);
		System.out.println(sv1.age + "");
		System.out.println(sv1.gender +"");
		
		Student sv2 = new Student("Join",7,"boy");
		System.out.println("sv1: " + sv2.name);
		System.out.println(sv2.age + "");
		System.out.println(sv2.gender + "");
		
		Student sv3 = new Student("Juli",6,"girl");
		System.out.println("sv3: " +sv3.name);
		System.out.println(sv3.age +"");
		System.out.println(sv3.gender +"");
			
		
	}
}