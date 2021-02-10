package Day12;

class Animal{
	public void shout() {
		System.out.println("Animals can shout");
	}
	
}
class Dog extends Animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("Dogs bark");
	
	}
	
	
}
class Horse extends Animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
	System.out.println("Horses neigh");
	
	}
	
	
}
class Cat extends Animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("Cat meow");
	
	}
}

public class PracticeTest {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal d=new Dog();
		Animal h=new Horse();
		Animal c=new Cat();
		d.shout();
		c.shout();
		h.shout();
	}

}
