package class1;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		// Classes are reference type.
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	}

}
