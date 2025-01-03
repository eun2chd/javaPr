package pratic01;

abstract class Payment {
	double amount;
	
	// 공통 메서드
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	// 추상메서드 
	abstract void processPayment();
}

// 카드 결제
class Carpayment extends Payment {
	@Override
	void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("카드 결제로 " + amount + "원 결제합니다.");
	}
}


// 계좌이체
class BankTransfer extends Payment {
	@Override
	void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("계좌 이체로 " + amount + "원을 결제합니다.");
		
	}
}




public class Main2 {
	public static void main(String[] args) {
	
		Payment p1 = new Carpayment();
		p1.setAmount(50000);
		p1.processPayment();
		
		Payment p2 = new BankTransfer();
		p2.setAmount(50000000);
		p2.processPayment();
		
		
	}
}
