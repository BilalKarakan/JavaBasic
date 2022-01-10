package interfaceTest;

public class CustomerManager {
private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		
		 //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
		 customerDal.add();
	}

}
