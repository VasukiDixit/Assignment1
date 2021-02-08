package Demo;

class P{
	int a=10;
	void display() {
		System.out.println("this is parent class");
	}
}
class Q extends P{
	int b=20;
	void show() {
		System.out.println("this is child class");
	}
}

public class SingleInheritanceExample {

	public static void main(String[] args) {
		
       Q q=new Q();
       q.show();
       System.out.println(q.b);
       System.out.println(q.a);
       q.display();

	}

}
