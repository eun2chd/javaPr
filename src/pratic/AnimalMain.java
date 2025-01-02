package pratic;

class Animanl {
	String species;
	
	public Animanl(String species) {
		this.species = species;
	}
	
	public void speak() {
		System.out.println("aniaml : " + species);
	}
}
	class Dog extends Animanl {
		String breed;
		
		public Dog(String species, String breed) {
			super(species); // 부모 클래스를 호출
			this.breed = breed;
		}

		@Override
		public void speak() {
			System.out.println("aniaml : "  + breed  + "aniaml" + species);
		}
	}
	public class AnimalMain {
		public static void main(String[] args) {
			
			Dog d1 = new Dog("Canine", "Labrador");
			d1.speak();
		}
				
	}


