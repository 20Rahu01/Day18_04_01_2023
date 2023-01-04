package Classwork;

public class Manager extends Employee {

	public Manager() {
		super();
	}

	public Manager(long id, String name, String address, long phone) {
		super(id, name, address, phone);
	}

	public Manager(long id, String name, String address, long phone, double salary) {
		this(id, name, address, phone);
		this.basicSalary = salary;
	}

	@Override
	void calculateTransportAllowance() {
		double transportAllowance = 0.0;
		transportAllowance = 0.15 * basicSalary;
		double salary = basicSalary - transportAllowance;
		System.out.println("The " + this.getClass().getSimpleName() + " Salary after transport is: " + salary);
	}

}

