package oop.oop01.pack5;

public class Person {
	
	private int age;
	private String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
