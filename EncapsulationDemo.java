package Demo;

class Student{
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void id(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student e =new  Student();
e.setId(2);
System.out.println(e.getId());


	}

}
