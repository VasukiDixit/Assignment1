package Day7;
class Parent{
	void property() {
		System.out.println("20 lakhs");
		
	}
	void marry() {
		System.out.println("HI");
	}
}
class Child extends Parent{
	void marry() {
		//super.marry(); //if we want to print "hi" also
		System.out.println("Hello");
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child c =new Child();
  c.property();
  c.marry();
  
	}

}
