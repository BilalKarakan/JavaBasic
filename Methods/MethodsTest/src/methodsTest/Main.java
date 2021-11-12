package methodsTest;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}
	public static void findNumber() {
		int[] numbers = new int[] {1, 2, 5, 6, 8,};
		int findNumber = 5;
		boolean isThere = false;
		
		for(int number:numbers) {
			if(number == findNumber) {
				isThere = true;
				break;
			}
		}
//		if(isThere) {
//			System.out.println("The numbers array contains "+findNumber);
//		}else {
//			System.out.println("The number array doesn't contain "+findNumber);
//		}
//	}
//	public static void giveMessage(int findNumber) {
//		System.out.println("The numbers array contains "+findNumber);
//	}
		
//		if(isThere) {
//			giveMessage("The numbers array contains "+findNumber);
//		}else {
//			giveMessage("The number array doesn't contain "+findNumber);
//		}
//	}
//	public static void giveMessage(String message) {
//		System.out.println(message);
//	}
		
		String message = "";
		if(isThere) {
			message = "The numbers array contains "+findNumber;
			giveMessage(message);
		}else {
			giveMessage("The number array doesn't contain "+findNumber);
		}
	}
	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
