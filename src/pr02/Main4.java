package pr02;

abstract class shape {
	String color;
	
	public shape(String color) {
		this.color = color;
	}
	
	// 추상 메서드
	abstract double calculateArea();
	
	public void display() {
		System.out.println("배 의 색쌀은 ? " + color);
	}
	
}

interface Drawable {
	void draw();
}

class Circle extends shape implements Drawable {
	
	double redius;
	
	public Circle(String color, double reids) {
		super(color); // 부모의 생성자 및 메서드가 호출됨
		this.redius = reids;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Cicle");
	}

	@Override
	double calculateArea() {
		return Math.PI * redius * redius;
		
	}
	
}

public class Main4 {
	public static void main(String[] args) {
		
		Circle circle = new Circle("Red", 5.0);
		circle.display();
		System.out.println("Area : " + circle.calculateArea());
		circle.draw();
	
	}
}