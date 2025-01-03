package pratic01;

// 추상클래스 정의
abstract class Animal {
	// 추상메서드 : 구현부 없음
	abstract void sound();
	
	// 일반 메서드 구현부가 있음
	void sleep() {
		System.out.println("잠을 잔다.");
	}	
}

// 추상 크래스를 상속받는 구체 클래스
class Dog extends Animal {
	// 추상메서드 구현
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// 추상메서드 구현
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹!");
	}
}
	
public class Main {
	public static void main(String[] args) {
		
		// 추상 클래스는 직접 객체 생성이 불가능함
//		Animal a1 = new Animal() 
		
		// 추상 클래스를 상속받은 클래스의 객체를 생성
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		dog.sleep();
		
		cat.sound();
		cat.sleep();
			
			
	}
}
