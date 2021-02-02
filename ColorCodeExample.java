package p1;
import java.util.Scanner;
public class ColorCodeExample {
public static void main(String args[]){
          Scanner SC=new Scanner(System.in);
           System.out.print("Enter the color code(0 to 5): ");
          int color=SC.nextInt();
           
          if(color<0 || color>5){
              System.out.println("Invalid color code");
              System.exit(0);
          }
          switch(color){
                case 0: 
                    System.out.println("Red");
                    break;
                case 1: 
                    System.out.println("Blue");
                    break;
                case 2: 
                    System.out.println("Green");
                    break;
                case 3: 
                    System.out.println("Orange");
                    break;
                case 4: 
                    System.out.println("Yellow");
                    break;
                case 5: 
                    System.out.println("White");
                    break;               
                default:
                    System.out.println("Invalid");
                    break;                  
          }
           
      }
}