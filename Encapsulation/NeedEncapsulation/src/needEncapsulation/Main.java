package needEncapsulation;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(123456789, "Laptop", "Asus Laptop", 4999.99, 3);
//		Product product = new Product();
//		product.setId(123456789);
//		product.set_name("Laptop");
//		product.set_description("Asus Laptop");
//		product.set_price(4999.99);
//		product.set_stockAmount(3);
		System.out.println(product.get_name());
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getId());
		productManager.Add2(2, "", "", 12.5, 2);
	}

}
