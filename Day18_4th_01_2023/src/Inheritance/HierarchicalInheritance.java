package Inheritance;

//there are two ways to implement -> override and abstract

class Bank{
	int loanInterest() {
		return 8;
	}
}

//Using Overriding
class SBI extends Bank{
	@Override
	public int loanInterest() { // not be private or protected must be public
		return 7;
	}
}
class AXIS extends Bank{
	@Override
	int loanInterest() {
		return 10;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		System.out.println("SBI-> "+sbi.loanInterest()+"%");
		
		AXIS axis=new AXIS();
		System.out.println("AXIS-> "+axis.loanInterest()+"%");
	}
}
