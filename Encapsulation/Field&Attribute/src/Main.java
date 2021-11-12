
public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 123456789;
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 4999.99;
		product.stockAmount = 3;
		System.out.println(product.name);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
