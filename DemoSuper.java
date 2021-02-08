package Demo;

class Parent1{
	Parent1(int id,String name){
	
	System.out.println("this is parent class");
	System.out.println("id" +  id + "name" +  name);
	
	
}
	}

class Child1 extends Parent1{
	Child1(int id,String name){
		super(id,name);
		System.out.println("this is child constructor");
	}
}
public class DemoSuper {
 public static void main(String[] args) {
	 Child1 c =new Child1(2,"mahima");
 }
}
