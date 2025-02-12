package wrapper01;

// 포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 == , != 연산자 사용 불가능
// - 내부 값을 비교하는게 아니라 포장 객체의 번지를 비교하기 때문에
// - 따라서, equals() 메소드로 내부 값을 비교해야 함

// - byte, short, int : -128 ~ 127
// - boolean : true, false
// - char : \u0000 ~ \u007f
// 위 범위에 포함되는 값은 포장 객체가 공유 (참조 값이 같다)

public class ValueCompaerEx {
	
	public static void main(String[] args) {
		// - 128 ~ 127 범위
		Integer obj1 = 10;
		Integer obj2 = 10;
		
		System.out.printf("%d == %d : %b\n", obj1, obj2, obj1 == obj2);
		System.out.printf("%d == %d : %s\n", obj1, obj2, obj1.equals(obj2));
		
		// char \u0000 ~ \u007f
		Character char1 = 'A';
		Character char2 = 'A';
		
		System.out.printf("%c == %c : %b\n", char1, char2, char1 == char2);
		System.out.printf("%c equals %c : %b\n", char1, char2, char1.equals(char2));
		
		// char \u0000 ~ \u007f
		Character char3 = '\u0101';
		Character char4 = '\u0101';
		
		System.out.printf("%c == %c : %b\n", char3, char4, char3 == char4);
		System.out.printf("%c equals %c : %b\n", char3, char4, char3.equals(char4));
		
		System.out.println();
		
	}

}
