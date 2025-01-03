package pratic01;

interface Animal1 {
	void sound(); // 추상 메서드
	void eat();
}

class Dog1 implements Animal1 {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");	
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개가 음식을 먹는다");
	}
}	

class Cat1 implements Animal1 {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 음식을 먹는다.");
	}
	
}
public class Main3 {
	public static void main(String[] args) {
		Animal1 a1 = new Dog1();
		a1.sound();
		a1.eat();
		
		Animal1 a2 = new Cat1();
		a2.sound();
		a2.eat();
	}
}
