package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'E';
		switch(grade) {
			case 'A' : 
				System.out.println("Excellent: Passed");
				break;
			case 'B' :
				System.out.println("Very Good: Passed");
				break;
			case 'C' : 
				System.out.println("Good: Passed");
				break;
			case 'D' : 
				System.out.println("Not Bad: Passed Condition");
				break;
			case 'F' : 
				System.out.println("Unsuccessful: Failed");
				break;
			default:
				System.out.println("Invalid Grade");
		}
	}

}
