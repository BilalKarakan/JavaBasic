
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age = 10;
		customer.email = "1234@gmail.com";
		employee.id = 123214;
		employee.salary = 5999.99;
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.Add();
		employeeManager.List();
		employeeManager.BestEmployee();
		
	}

}
