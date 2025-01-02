package pratic;

public class Car {
	
	String brand;
	int year;
	
	// 기본 생성자
	public Car() {
		this("Unknow", 0); // 다른 생성자 호출??
		// this 는 같은 클래스의 멤버변수를 가르킨다.
	}
	
	public void display() {
		System.out.println("brand : " + brand + " year" + year);
	}
	
	public Car(String brand, int yaer) {
		this.brand = brand;
		this.year = year;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car(); // 기본 생성자 호출
		car1.display();
			
		Car car2 = new Car("Toyota", 2021);
		car2.display();
		
	}
	


	

}
