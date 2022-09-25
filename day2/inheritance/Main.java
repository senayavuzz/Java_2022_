package day2.inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age = 25;
		customer.email = "test@gmail.com";
		employee.salary = 5000;
		employee.age = 34;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.bestEmployee();
		employeeManager.add();
		customerManager.add();
		

	}

}
