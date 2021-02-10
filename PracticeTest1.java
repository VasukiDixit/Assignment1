package Day12;
class Employee{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
public class PracticeTest1 {
	public static void main(String[] args) {
		Employee em=new Employee("Vasuki","Dixit");
		System.out.println(em);
	}

}
