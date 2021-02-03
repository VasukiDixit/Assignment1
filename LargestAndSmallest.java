package Assignment2;
import java.util.Scanner;
public class LargestAndSmallest {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elemets");
		int n=sc.nextInt();
		int a[] = new int[n];
		int smallest = a[0];
        int biggest = a[0];
       
		System.out.println("enter the elemets of array");
		 for ( i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
       
        for( i=0; i<a.length; i++)
        {
                if(a[i] > biggest)
                        biggest = a[i];
                else if (a[i] < smallest)
                        smallest = a[i];
               
               
        }
        System.out.println("Smallest Number is : " + smallest);
  System.out.println("Largest Number is : " + biggest);
      
}
}