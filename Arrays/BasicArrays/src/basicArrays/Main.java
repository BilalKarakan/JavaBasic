package basicArrays;

public class Main {

	public static void main(String[] args) {
		String student1 = "Bilal";
		String student2 = "Elif";
		String student3 = "Ali";
		String student4 = "Ayşe";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("---------------------");
		
		String[] students = new String[4];
		students[0] = "Bilal";
		students[1] = "Elif";
		students[2] = "Ali";
		students[3] = "Ayşe";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------------");
		
		for(String student:students) {
			System.out.println(student);
		}

	}

}
