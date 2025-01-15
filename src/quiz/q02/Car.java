package quiz.q02;

public class Car {
		
	private String name;
	private String brand;
	private int speed;
	
	public Car(String name, String brand, int speed) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.brand = brand;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void printInfo() {
		System.out.println("차 이름 : " + name);
		System.out.println("차 브랜드 : " +  brand);
		System.out.println("차 스피드 : " + speed);
	}
	
	

}
