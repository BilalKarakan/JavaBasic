package abstractClasses;

public class Main {

	public static void main(String[] args) {
		MenGameCalculator  menGameCalculator = new MenGameCalculator();
		menGameCalculator.calculate();
		menGameCalculator.gameover();
		
		/*
		 * GameCalculator gameCalculator = new GameCalculator() {
		 * 
		 * @Override public void calculate() { 
		 * 
		 * } };
		 */
		
		//GameCalculator gameCalculator = new GameCalculator();
		GameCalculator gameCalculator = new WomenGameCalculator();
	}

}
