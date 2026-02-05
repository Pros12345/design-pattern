package FactoryDesign;

public class AndroidDevloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Android devloper salary");
		return 50000;
	}

}
