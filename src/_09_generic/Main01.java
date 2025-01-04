package _09_generic;

// Number 클래스
// - Java 에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 모든 타입 포함

class Box<T extends Number> {
	private T item;

	/**
	 * @return the item
	 */
	public T getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(T item) {
		this.item = item;
	}
	
}
public class Main01 {
	public static void main(String[] args) {
//		Box<String> stringBox = new Box<String>(); // extends Number로 String 못들어감
		Box<Double> doubleBox = new Box<>();
		doubleBox.setItem(3.14);
		System.out.println(doubleBox.getItem());
		
		Box<Short> shortBox = new Box<>();
		//(short) 형변환 필요한 이유?
		// - java 에서 정수 리터럴 기본적으로 int 로 간주
		// - 명시적으로 short 로 형 변환 후 넘겨주어야 함
	
		shortBox.setItem((short)40);
		System.out.println(shortBox.getItem());
		
	}

}
