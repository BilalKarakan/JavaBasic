package letters;

public class Main {

	public static void main(String[] args) {
		char letter = 'F';
		
		switch(letter) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(letter+ " is a bold vowel in Turkish.");
				break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println(letter+ " is a thin vowel in Turkish");
				break;
			default:
				System.out.println("Invalid letter");
				
		
		}

	}

}
