package Classwork;



public class InheritanceActivity {
	public static void main(String[] args) {
		Manager mb = new Manager(126534, "Peter", "Chennai", 237844, 65000);
		mb.showBasicSalary();
		mb.calcuateSalary();
		mb.calculateTransportAllowance();
		System.out.println("-------------------------------------------------");
		Trainee tb = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		tb.showBasicSalary();
		tb.calcuateSalary();
		tb.calculateTransportAllowance();
	}
}
