package pratic01;
// 다중 인터페이스 구현

interface Flyable2 {
	void fly();
}

interface Swimble {
	void swim();
}

class Duck implements Flyable2, Swimble {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("오리가 물에서 헤엄친다~");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리가 날아간다~");
	}
	
	
}

public class Main4 {
	public static void main(String[] args) {
		Duck d1 = new Duck();
		d1.fly();
		d1.swim();

	}
}
