package friendlyNumbers;

public class Main {

	public static void main(String[] args) {
		int number1 = 284;
		int number2 = 220;
		int result1 = 0;
		int result2 = 0;
		
		for(int i=1; i<number1; i++) {
			if(number1 % i == 0) {
				result1 += i;
			}
		}
		for(int i=1; i<number2; i++) {
			if(number2 % i == 0) {
				result2 += i;
			}
		}
		if(number1 == result2 && number2 == result1) {
			System.out.println(number1+ " and " +number2+ " are friendly number.");
		}else {
			System.out.println(number1+ " and " +number2+ " are not friendly number.");
		}

	}

}
