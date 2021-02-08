package Demo;

class Employee{
			int id;
			String name;
			
			public Employee(int id,String name) {
				this.id=id;
				this.name=name;
			}

			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + "]";
			}
			
			
		}

		
		public class PackageExample {
			public static void main(String[] args) {
				
				Employee emp1=new Employee(1, "sachin");
				Employee emp2=new Employee(2, "mahima");
				
				System.out.println(emp1);
				System.out.println(emp2);
				
				System.out.println(emp1.hashCode());
				System.out.println(emp2.hashCode());
				
	}

			
	

}
