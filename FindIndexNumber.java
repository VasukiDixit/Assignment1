package Assignment2;
import java.util.Scanner;
public class FindIndexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array elements");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
		int position=0;
		int flag=0;
		int i;
		System.out.print("Enter the element you want to find:");
      int  x = sc.nextInt();
        for( i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
