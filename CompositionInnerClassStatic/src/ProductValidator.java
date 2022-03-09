
public class ProductValidator {
	
	static{
		System.out.println("Static constructor runned.");
	}
	
	public ProductValidator() {
		System.out.println("The constructor runned.");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void anything() {
		
	}
	
	public static class anotherthing {  // inner class
		public static void remove() {
			System.out.println("Removed.");
		}
	}
}
