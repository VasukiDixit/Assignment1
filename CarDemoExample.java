package Assignment3;
class Car{
	int yearModel;
	String make;
	int speed;
	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
	}
	
	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate() {
		speed=speed+5;
	}
	public void brake() {
		speed=speed-5;
		if(speed<0) {                   // to avoid the speed in negative
			speed=0;
		}
	}
}

public class CarDemoExample {
	public static void main(String[] args)
	{
		Car c=new Car(1965,"BatMobile");
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		}
}
