package FactoryDesign;

public class DevloperClient {

	public static void main(String[] args) {

		Employee employee = EmployeeFactory.getEmployee("Android Devloper");
		employee.getSalary();
		System.out.println("Salary : " + employee.getSalary());
	}

}
