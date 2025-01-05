package pr02;

class Car {
	String brand;
	int spped;
	
	// 생성자
	public Car(String brand, int speed) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.spped = speed;
	}	
	
	// 메서드 
	public void drive() {
		System.out.println("기종 : " + brand);
		System.out.println("스피드 : " + spped);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Tesla", 10);
		car1.drive();
		
		Car car2 = new Car("BMW", 20);
		car2.drive();
		
	}
}
