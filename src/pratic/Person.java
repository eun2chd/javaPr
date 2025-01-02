package pratic;

public class Person {
	
	String name;
	int age;
	
	// 기본 생성자
	public Person() {
		this.name = "Unknow";
		this.age = 0;
	}
	
	// 매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Name : " + name + "age : " + age);
	}
	
	public static void main(String[] args) {
			
		Person p1 = new Person(); // 생성자 호출
		p1.printInfo();
		
		Person p2 = new Person("Alice", 20); // 매개변수 생성자 호출
		p2.printInfo();
		
	}

}
