package needEncapsulation;

public class Product {
	
		public Product(int id, String name, String description, double price, int stockAmount){
			System.out.println("Constructor çalýþtý.");
			this._id = id;
			this._name = name;
			this._description = description;
			this._price = price;
			this._stockAmount = stockAmount;
		}
		public Product() {
			
		}
		// attribute | field
		private int _id;
		private String _name;
		private String _description;
		private double _price;
		private int _stockAmount;
		private String _color;
		
		//Private sadece tanýmlandýðý blockda geçerlidir.
		//Default olarak publicdir.
		
		public int getId() {
			return _id;
		}
		public int setId(int id) {
			//this.id bu classdaki id demek.
//			this.id = id; bunun yerine attributelara _ ile baþlanabilir. this.id = _id olur.
			return _id = id;
		}
		public String get_name() {
			return _name;
		}
		public void set_name(String _name) {
			this._name = _name;
		}
		public String get_description() {
			return _description;
		}
		public void set_description(String _description) {
			this._description = _description;
		}
		public double get_price() {
			return _price;
		}
		public void set_price(double _price) {
			this._price = _price;
		}
		public int get_stockAmount() {
			return _stockAmount;
		}
		public void set_stockAmount(int _stockAmount) {
			this._stockAmount = _stockAmount;
		}
		public String get_color() {
			return _color;
		}
		public void set_color(String _color) {
			this._color = _color;
		}
}
