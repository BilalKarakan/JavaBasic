package findTheNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 2, 5, 6, 8,};
		int findNumber = 5;
		boolean isThere = false;
		
		for(int number:numbers) {
			if(number == findNumber) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("The numbers array contains "+findNumber);
		}else {
			System.out.println("The number array doesn't contain "+findNumber);
		}
	}

}
