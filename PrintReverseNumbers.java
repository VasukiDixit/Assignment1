package p1;
import java.util.Scanner;
public class PrintReverseNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		int reversed=0;
		 System.out.print("Enter the number : ");
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		 while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);
	    }
	}
		 

	


