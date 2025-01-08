package pratic01;

import java.util.ArrayList;

abstract class Vehicle1 {
	private String name;
	private int MaxSpeed;
	
	abstract void move();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return MaxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}
}

interface Flyable1 {
	void fly();
}

class Car1 extends Vehicle1 {

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("도로를 따라 이동중");
		
	}
	
}

class Airplane1 extends Vehicle1 implements Flyable1 {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("고도 10,000 피트에서 비행중");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날아가는중");
		
	}
	
}


public class Main8 {

	public static void main(String[] args) {
		
		ArrayList<Vehicle1> vehicles = new ArrayList<>();
		
		vehicles.add(new Car1());
		vehicles.add(new Airplane1());
		
		for (Vehicle1 veh : vehicles) {
			veh.move();
			
			if(veh instanceof Flyable1) {
				Flyable1 fly = (Flyable1) veh;
				fly.fly();
			}
		}

	
	}
}
