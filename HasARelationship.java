package Day7;
class Employee{
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo() {
			System.out.println("id is" + id);
			System.out.println("name is" + name);
			System.out.println("door no is" + Address.doorNo);
			System.out.println("city is" + Address.city);
			
		}
		
	}
	
class Address{
     static int doorNo;
	String strretname;
	static String city;
	public Address(int doorNo, String strretname, String city) {
		super();
		this.doorNo = doorNo;
		this.strretname = strretname;
		this.city = city;
	}
	
}

public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address(123,"btm","banglore");
		Employee emp=new Employee(1,"rama","mysore");
		emp.displayEmployeeInfo();

	}

}
