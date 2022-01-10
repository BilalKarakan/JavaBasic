package interfaceTest;

public class Main {

	public static void main(String[] args) {
		//ICustomerDal customerDal = new ICustomerDal();
		
		/*
		 * ICustomerDal customerDal = new OracleCustomerDal();
		 * customerDal.add();
		 */
		
		/*
		 * CustomerManager customerManager = new CustomerManager();
		 * customerManager.customerDal = new OracleCustomerDal(); customerManager.add();
		 */
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}
}


