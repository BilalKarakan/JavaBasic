package conditional;

public class Main {

	public static void main(String[] args) {
		int number = 10;
		if(number<10) {
			System.out.println(number+ " 10 dan k���kt�r.");
		}else {
			System.out.println(number+ " 10 dan k���k de�ildir.");
		}
		
		
		if(number == 10) {
			System.out.println("number 10 a e�ittir.");
		}
		
		if(number>10) {
			System.out.println(number+" 10 dan b�y�kt�r.");
		}else if(number == 10) {
			System.out.println(number+" 10 a e�ittir.");
		}else {
			System.out.println(number+" 10 dan k���kt�r.");
		}
		
	}

}
