
public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("The product added!");
		}else {
			System.out.println("Invalid knowledge!");
		}
		
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.anything();
		// Newleme yap�lmazsa yap�c� blok �al��maz.
	}
	
}
