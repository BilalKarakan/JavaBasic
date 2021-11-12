package demo2;

public class Main {

	public static void main(String[] args) {
		//double[] myList = new doube[4];
		double[] myList = {2.7, 3.7, 4.7, 5.7};
		
		for(double number:myList) {
			System.out.println(number);
		}
		
		double result = 0;
		for(int i = 0; i < myList.length; i++) {
			result += myList[i];
		}
		System.out.println(result);
		
		double greatest = myList[0];
		if(greatest < myList[1]) {
			greatest = myList[1];
		}
		if(greatest < myList[2]) {
			greatest = myList[2];
		}
		if(greatest < myList[3]) {
			greatest = myList[3];
		} 
		System.out.println(greatest);
		
		double max = myList[0];
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
		}
		System.out.println(max);
	}

}
