package pratic;

public class Main {
	
	String name;
	int age;
	
	public Main() {
		this.name = "place";
		this.age = 10;
	}
	
	public Main(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printfInfo() {
		System.out.println("Name : " + name + " " + "age : " + age);
	}
	
	public static void main(String[] args) {
		
		Main m1 = new Main();
		m1.printfInfo();
		
	}
}
