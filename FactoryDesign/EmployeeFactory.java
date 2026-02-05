package FactoryDesign;

public class EmployeeFactory {

	public static Employee getEmployee(String empType) {
		if (empType.equalsIgnoreCase("Android Devloper")) {
			return new AndroidDevloper();
		} else if (empType.equalsIgnoreCase("Web Devloper")) {
			return new WebDevloper();
		} else
			return null;
	}
}
