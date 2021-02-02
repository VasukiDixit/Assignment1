package p1;
import java.util.Scanner;
public class FloydPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n;
    System.out.println("enter the number of rows");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();  
  for(i=0; i<n; i++)   
  {    
  for(j=0; j<=i; j++)   
  {   
  //prints stars   
  System.out.print("* ");   
  }   
  //throws the cursor in a new line after printing each line  
  System.out.println();   
  }   
  }   
  }  