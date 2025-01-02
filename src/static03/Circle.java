package static03;

public class Circle {
	
	// final 필드
	private final double redius;
	
	// 원주율 상수 -> 대문자로 작성
	private static final double PI = 3.14159265;

	public static double calculateArea(double cir) {
		return cir * cir * PI;
	}

	public double getRedius() {
		return redius;
	}


	public static double getPi() {
		return PI;
	}





	public Circle (double redius) {
		this.redius = redius;
	}
	
	
}
