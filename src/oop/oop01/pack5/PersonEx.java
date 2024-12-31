package oop.oop01.pack5;

public class PersonEx {
	public static void main(String[] args) {
		
		// 객체 생성
		Person p1 = new Person("minon");
		
		p1.setAge(4); // 
		System.out.println(p1.getName() + "의 나이는" + p1.getAge());
		
		
		p1.setAge(-6);
		System.out.println(p1.getName() + "의 나이는" + p1.getAge());
		
		
		
	}

}
