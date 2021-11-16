package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate();
		
	public final void gameover() {
		System.out.println("The game is over");
	}
}
