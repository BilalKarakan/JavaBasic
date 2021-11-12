package variableArguments;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is sunny today.";
//		String newMessage = message.substring(0,3);
//		String newMessage = sum();
		String newMessage = giveCity();
		System.out.println(newMessage);
		int number = sum(4,5);
		System.out.println(number);
		int number2 = sum2(2,3,4,5,6,7,8);
		System.out.println(number2); 
		
	}
	public static void add() {
		
	}
	public static void remove() {
		
	}
	public static void update() {
		
	}
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	public static int sum2(int... numbers) {
		int result = 0;
		for(int number : numbers) {
			result += number;
		}
		return result;
	}
	
	public static String giveCity() {
		return "Ankara";
	}
}


