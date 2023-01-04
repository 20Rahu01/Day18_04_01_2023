package Inheritance;


//chaining Inheritance -:: A->B->C


class User{ // -->> parent class/super/base
	int id;
	String name;
	String address;
	
	public User(int id, String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
//	void setData(int id, String name,String address) {
//		this.id=id;
//		this.name=name;
//		this.address=address;
//	}
	void display() {
		System.out.println("Id: "+id +" name: "+name+" address: "+address);
	}
}

class Emp extends User{ // -->> Child class/sub/derived
	// so child class have its own features along with all the parents class
	int salary;
	public Emp(int id, String name,String address,int salary) {
		super(id,name,address);
		this.salary=salary;
	}
	void display() {
		super.display();
		System.out.println("Salary: "+salary);
	}
	
	// it can have own constructor
//	public Emp(int salary) {
//		this.salary=salary;
//	}
	// it can have own method also
	int CalculateGross() {
		return salary*12;
	}
}

class Rahul extends Emp{

	public Rahul(int id, String name, String address, int salary) {
		super(id, name, address, salary);
		// TODO Auto-generated constructor stub
	}
	
}
public class MultilevelInheritance {
//	//here is two main methods but JVM will 
//	//call that main method where the parameter is String
//	// We can overload main method 
//	public static void main(String[] args) {
//		System.out.println("inside main");
//		SingleInheritance.main(3);
//	}
//	public static void main(int a) {
//		System.out.println(a);
//		
//	}
	public static void main(String[] args) {
	Rahul obj = new Rahul(1, "Rahul", "Howrah", 30000);	
	obj.display();
	}
}



