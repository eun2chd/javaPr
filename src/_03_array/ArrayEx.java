package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 표준 배열

// 배열
// 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야함
// 배열의 원소는 모두 같은 타입
// 처음 선언한 배열 크기 변경 불가능(단, ArrayList 컬렉션의 경우 동적으로 크기 조절 가능)

public class ArrayEx {

	public static void main(String[] args) {
		
		// 정수를 저장
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		// 문자열 저장
		ArrayList<String> names = new ArrayList<String>();
		
		// 요소 추가
		numbers.add(10);
		numbers.add(20);
		
		names.add("짱구");
		names.add("둘리");
		
		
		// 요소 접근하기
		System.out.println("----요소 접근-----");
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		// 요소 수정
		numbers.set(0, 30);
		names.set(1, "공룡");
		System.out.println("----요소수정-----");
		System.out.println(numbers.get(0));
		System.out.println(names.get(1));
		
		// 요소 삭제
		System.out.println("----요소삭제-----");
		numbers.remove(0);
		System.out.println(numbers);
		
		
		// 사이즈 확인
		System.out.println("----사이즈 확인-----");
		System.out.println(numbers.size());
		
		// 요소 포함여부 확인
		System.out.println("----요소 포함여부 확인-----");
		System.out.println(names.contains("짱구"));
		
		// 요소 반복
		System.out.println("----요소 반복-----");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		// Student 타입의 arrayList 사용
		ArrayList<Student> students = new ArrayList<>();
	
		Student std1 = new Student("joh", 12);
		students.add(std1);
		

	}

}

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name;}
	public int getAge() { return age; }
	
	// toString() 메서드 오버라이드
	// 객체를 문자열로 표현할 때 어떻게 출력할지 정의 기능 (변수 이름으로 println 했을 때)
	// 사용자 정의 타입에서 오버라이드 하지 않으면 Object 객체의 toString() 메서드가 호출되며,
	// 이는 객체의 클래스 이름과 해시코드를 문자열로 반환 (즉, 참조값(클래스명@해시코드)를 반환)
	
	// Integer 같은 클래스는 toString() 매서드가 정의되어 있어서, println 했을 때 메서드 등을 통해 출력할 때 해당 객체의 값을 출력
	public String toString() {
		 return "Student { name = '" + name + "', age = " + age + " }";
	}
	
}
