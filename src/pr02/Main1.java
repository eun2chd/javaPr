package pr02;

class Car2 {
	String brand;
	int speed;
	
	public Car2(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void drive() {
		System.out.println(brand);
		System.out.println(speed);
	}
}


public class Main1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2("BMW", 10);
		c1.drive();
		
		Car2 c2 = new Car2("SWP", 20);
		c2.drive();
	}
}
