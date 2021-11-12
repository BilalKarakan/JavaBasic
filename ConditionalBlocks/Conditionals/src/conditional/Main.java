package conditional;

public class Main {

	public static void main(String[] args) {
		int number = 10;
		if(number<10) {
			System.out.println(number+ " 10 dan küçüktür.");
		}else {
			System.out.println(number+ " 10 dan küçük deðildir.");
		}
		
		
		if(number == 10) {
			System.out.println("number 10 a eþittir.");
		}
		
		if(number>10) {
			System.out.println(number+" 10 dan büyüktür.");
		}else if(number == 10) {
			System.out.println(number+" 10 a eþittir.");
		}else {
			System.out.println(number+" 10 dan küçüktür.");
		}
		
	}

}
