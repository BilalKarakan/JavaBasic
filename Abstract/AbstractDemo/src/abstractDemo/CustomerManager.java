package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager baseDataManager;
	public void getCustomers() {
		/*
		 * OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		 * oracleDatabaseManager.getData();
		 */
		baseDataManager.getData();
	}
}
