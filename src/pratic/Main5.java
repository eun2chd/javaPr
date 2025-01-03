package pratic;
// 다양한 객체 생성자 연습

class Product {
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void showDetails() {
		System.out.println("Name : " + name + "price" + price);
	}
}

class Electornoic extends Product {
	int warranty;
	
	public Electornoic(String name, double price, int warranty) {
		// 부모생성자 자동으로 호출됨
		super(name, price);
		this.warranty = warranty;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("---자식--- Warranty" + warranty + "years");
	}
}
	
public class Main5 {
	public static void main(String[] args) {
		Product p1 = new Product("Chir", 49.95);
		p1.showDetails(); // 부모꺼 한번 호출 (p1 에서 주었던 값이 들어감)
		
		
		// 자식에서 상속 한번 받고 자식들 값을 받아서 부모 인스턴스 한번더 호출함)
		Electornoic e1 = new Electornoic("피자", 45.15, 2);
		e1.showDetails();

	}

}
