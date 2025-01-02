package pratic;

class Parent {
	public Parent() {
		System.out.println("부모 쪽");
	}
}

class Child extends Parent {
	public Child() {
//		super(); // 생략 가능 ( 기본적으로 부모 클래스 생성자 호출함)
		System.out.println("아들쪽");
	}
}


public class Main3 {
	public static void main(String[] args) {
		Child ch1 = new Child();
	}

}
