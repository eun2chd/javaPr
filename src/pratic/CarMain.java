package pratic;

class Carpa {
	String carName;
	
	public Carpa(String carName) {
		this.carName = carName;
	}

	public void carInfo() {
		System.out.println("내 차 : " + carName);
	}
}
	
 class Mysec extends Carpa {
	 String breed;
	 
	 public Mysec(String carName, String breed) {
		 super(carName);
		 this.breed = breed;
	 }

	@Override
	public void carInfo() {
		// TODO Auto-generated method stub
		System.out.println("브랜드" + breed  + "내 차 : " + carName);
	}
	 
 }


public class CarMain {
	public static void main(String[] args) {
		
		Mysec s1 = new Mysec("쏘나타", "현대");
		s1.carInfo();
	}

}
