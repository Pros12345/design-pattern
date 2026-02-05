package FactoryDesign;

public class WebDevloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Web devloper salary");
		return 530000;
	}

}
