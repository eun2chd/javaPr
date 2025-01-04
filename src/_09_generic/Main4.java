package _09_generic;

class Calculator<T extends Number> {
	private T num1;
	private T num2;
	
	public Calculator(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return num1.doubleValue() + num2.doubleValue();
	}

	/**
	 * @return the num1
	 */
	public T getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(T num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public T getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(T num2) {
		this.num2 = num2;
	}

}

public class Main4 {
	public static void main(String[] args) {
		
		Calculator<Integer> c1 = new Calculator(10, 5);
		Calculator<Double> c2 = new Calculator(5.66, 7.41);
		
		System.out.println("Integer Sum : " + c1.add());
		System.out.println("Double Sum : " + c2.add());
		

	}

}
