package reCapDemo;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		int result1 = fourOperations.addition(2,3,4,5);
		int result2 = fourOperations.subtraction(10, 20);
		int result3 = fourOperations.multiplication(2,3,4,5,6);
		int result4 = fourOperations.division(4,3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
