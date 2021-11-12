package multidimensionalArray;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[4][3];
		
		cities[0][0] = "İstanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Samsun";
		cities[1][1] = "Ordu";
		cities[1][2] = "Giresun";
		cities[2][0] = "Ankara";
		cities[2][1] = "Konya";
		cities[2][2] = "Kayseri";
		cities[3][0] = "İzmir";
		cities[3][1] = "Manisa";
		cities[3][2] = "Uşak";
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("----------------------");
			for(int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}
		}
		

	}

}
