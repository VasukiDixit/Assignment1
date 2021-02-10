package Day12;

import java.util.Scanner;

class ExceptionProgram{
	private String firstName;
	private String lastName;
	public ExceptionProgram(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void checkName() {
	try {
	if(firstName==" "||lastName==" ") {
		throw new NullPointerException();
	}
	else if(firstName.length()<3 || lastName.length()<3) {
		throw new ArrayStoreException();
	}
	else
	{
		System.out.println("correct");
	}

}
	catch(NullPointerException n) {
		n.printStackTrace();
	}
	catch(ArrayStoreException a) {
		a.printStackTrace();
	}
	}
class NullPointerException extends Exception{
		public String toString() {
			return "entry missing";
		}
	}
class ArrayStoreException extends Exception{
		public  String toString() {
			return "name shold be minimum 3 character";
		}
	}
  
//public class  ExceptionProgram {
public static void main(String[] args) {
	 
	ExceptionProgram em=new ExceptionProgram("Vasuki","Dixit");
/*Scanner sc=new Scanner(System.in);
System.out.println("enter the firstname");
String firstName=sc.next();
System.out.println("enter the lastname");
String lastName=sc.next();*/
em.checkName();

	}

}


