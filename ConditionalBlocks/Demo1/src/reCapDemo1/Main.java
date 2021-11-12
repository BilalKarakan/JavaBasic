package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 14;
		int number2 = 13;
		int number3 = 12;
		
		int greatest = number1;
		
		if(number2 > greatest) {
			greatest = number2;
		}
		if(number3 > greatest) {
			greatest = number3;
		}
		System.out.println("The greatest number is "+ greatest);
	}

}
