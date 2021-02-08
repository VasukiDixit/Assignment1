package Day7;
class Bank{
	void rateOfInterest() {
		System.out.println("two percent");
	}
	void minimumBalance() {
	//int	minbal=1000;
		System.out.println("1000");
	}
}
class Axis extends Bank{
	void rateOfInterest() {
	//	super.rateOfInterest();               if we want to print two percent also
		System.out.println("four percent");
	}
	}
class Icici extends Bank{
	void rateOfInterest() {
		System.out.println("seven percent");
	}
	
}
public class BankDemo {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank b=new Axis();
      Bank b1=new Icici();
      b.rateOfInterest();
      b1.rateOfInterest();
      b.minimumBalance();
      b1.minimumBalance();
	}

}
