package Day12;
import java.util.Scanner;
public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
        Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("enter the no of array elements");
		int n=sc.nextInt();
		
		System.out.println("enter array elemets");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<18) {
				a++;
			}
			else if(arr[i]>=18 && arr[i]<=54) {
				b++;
		}
			else
			{
				c++;
			}
		}
		System.out.println("Children:" + a + "Adult:" + b + "senior citizen" + c);
	}

}
