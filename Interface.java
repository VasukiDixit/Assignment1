package Assignment3;

import Assignment4.*;

class Square implements Polygon{
	 float side;
	
	 Square(float s) {
		side = s;
	}
	 public float calArea() {
		System.out.println(side*side);
		return side;
		
	}
	public double calPeri() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
 class Rectangle implements Polygon{
	double length;
	 double breadth;
	
public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
public double calPeri() {
	System.out.println(2*(length*breadth));
	return 2*(length*breadth);
	
}
public float calArea() {
	// TODO Auto-generated method stub
	return 0;
}


 }
	public class Interface {
	 public static void main(String[] args) {
	        Square sq = new Square(2);
	        Rectangle re=new Rectangle(4,4);
	        sq.calArea();
	        re.calPeri();
	       
	 }   
	     
	}
