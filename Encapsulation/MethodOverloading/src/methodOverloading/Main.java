package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.sum(10, 20));
		System.out.println(fourOperations.sum(30, 40, 50));
	}

}
