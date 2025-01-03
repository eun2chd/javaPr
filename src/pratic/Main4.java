package pratic;
// 상속과 매개변수 생성자

class Employee {
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println("Name : " + name + "ID : "+ id);
	}
}

class Manager extends Employee {
	String department;
	
	public Manager(String name, int id, String department) {
		super(name, id); // 부모 생성자 호출
		this.department = department;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Departemnt : " + department);
	}
	
}


public class Main4 {
	public static void main(String[] args) {
		Manager m1 = new Manager("Join", 101 , "Sas");
		m1.displayInfo();
	}

}
