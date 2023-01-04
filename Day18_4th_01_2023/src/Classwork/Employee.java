package Classwork;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	public Employee() {
		super();
	}

	public Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	void showBasicSalary() {
		System.out.println("The " + this.getClass().getSimpleName() + " Basic Salary is: " + basicSalary);
	}

	void calcuateSalary() {
//		double salary = 0.0;
		double salary = basicSalary + (basicSalary * (specialAllowance / 100)) + (basicSalary * (hra / 100));
		System.out.println("The " + this.getClass().getSimpleName() + " Salary is: " + salary);
	}

	void calculateTransportAllowance() {
//		double transportAllowance = 0.0;
		double transportAllowance = (10/100) * basicSalary;
		double salary = basicSalary - transportAllowance;
		System.out.println("The " + this.getClass().getSimpleName() + " Salary after transport is: " + salary);
	}
}

