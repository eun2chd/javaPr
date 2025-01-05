package pr02;

class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sound() {
		System.out.println(name + "sound");
	}
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(name + "barks");
	}
	
}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sound() {

		System.out.println(name + "meows.");
	}
	
}

public class Main3 {
	public static void main(String[] args) {
		
		Animal a1 = new Dog("Bubby");
		Animal a2 = new Cat("Kitty");
		Animal a3 = new Animal("putty");
		
		a1.sound();
		a2.sound();
		a3.sound();
	
	}
}
