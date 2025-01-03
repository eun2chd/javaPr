package wrapper01;


// Wrapper 객체 : 기본 타입 값을 갖는 객체를 생성
// - java.lang 패키지에 포함되어 있음
// - 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는데 목적이 있다.
// - 컬렉션 객체 때문 : 기본 타입의 값은 저장할 수 없고, 객체만 저장가능함
public class BoxingUnBoxingEx {
	public static void main(String[] args) {
		// Boxing
		// 기본 타입의 값을 포장 객체로 만드는 과정
		// 포장 클래스 변수에 값이 대입이 될 때 발생함
		Integer obj = 100;
		Double obj2 = 3.14;
		System.out.println(obj); // 100
		System.out.println(obj2); // 3.14
		
		// intValue() : Integer 내부의 int 값 리턴
		System.out.println(obj.intValue()); // 100
		System.out.println(obj2.doubleValue()); // 3.14
		
		// UnBoxing
		// - 포장 객체에서 기본 타입 값을 얻는 과정
		// - 기본 타입 변수에 포함 객체가 대입될 때 발생
		int value = obj;
		double value2 = obj2;
		System.out.println(value);
		System.out.println(value2);
		
		
		// 연산 시 Boxing
		int result1 = obj + 100;
		System.out.println(result1);
	

	}
	
}
