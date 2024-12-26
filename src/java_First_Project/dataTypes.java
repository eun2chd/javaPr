package java_First_Project;


// 자료형
// Primitive Type (기본형)
// Boolean Type
// Numeric Type
//  - Integral Type (short , int , long)
//  - Floation potit Type (float , double)
//  - character Type (char)
// Reference Type ( 참조형 )
// Class Type
// Interface Type
// Array Type

// Primitive Type ( 기본형 )
// 사용되기 전에 선언되어야함
// OS 에 따라 자료형 길이 변하지 않음
// - "비객체" 타입 -> NULL 값을 가질 수 없음
// Reference Type 
// - java.lang.Object 상속 받고있음 - 객체형태
// - 기본형이 아니면 다 참조형
public class dataTypes {
	public static void main(String[] args) {
		// 기본형
		System.out.println("===== Primivie Type ======");
		
		
		int x = 10;
		long y = 1000000000l; // long 타입은 뒤에 'L' or 'l' 붙여야 함
		short z = 3267;
		byte b = 127;
		
		// 실수형 변수 선언
		float a =  3.14f;
		double c = 2.74322;
		
		char ch = 'A';
		
		// 논리형 변수 선언
		boolean bool = true;
		
		// 변수 출력
		System.out.println("정수형 변수 " + x);
		System.out.println("실수형 변수 " + a);
		
		
		// String 참조형 변수 선언과 초기화
		// - Java 에서 String 타입은 특별함, 참조형이지만 기본형처럼 사용함(불변 객체)
		// - 기본 자료형은 "==" 연산자를 통해 비교하지만, String 객체간 비교는 .equals() 메서드 사용
		
		String greeting = "Hello. World";
		
		// 배열 참조형 변수 선언과 초기화
		int[] numbers = {1,2,3,4,5};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		
		// 클래스 변수형 참조 선언과 초기화
		class Person { 
			String name;
			int age;
			
			public Person(String name, int age) {
				this.name = name;
				this.age = age;
			}
			
			String getName() {
				return name;
			}
			
		}
		
		Person person = new Person(greeting, 10);

		
		
	}

}
