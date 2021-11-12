package primeNumbers;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;
		
		if(number == 1 || number <= 0) {
			System.out.println("Invalid number");
			return;
		}
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}else {
				isPrime = true;
			}
		}
		if(isPrime){
			System.out.println(number+ " is a prime number.");
		}else {
			System.out.println(number+ " is not a prime number");
		}
		
	}

}
