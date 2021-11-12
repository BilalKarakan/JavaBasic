package reCapDemo;

public class FourOperations {

	public int addition(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
	public int subtraction(int number1, int number2) {
		return number1 - number2;
	}
	public int multiplication(int... numbers) {
		int multi = 1;
		for(int number:numbers) {
			multi = multi * number;
		}
		return multi;
	}
	public int division(int number1, int number2) {
		return number1 / number2;
	}

}