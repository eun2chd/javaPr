package pratic01;

import java.util.ArrayList;

abstract class Vehicle {
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

interface Flyable {
	void fly();
}

class Car extends Vehicle  {

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("도로를 따라 이동중");

	}

}

class Airplane extends Vehicle implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("고도 10,1000 피트에서 비행중");

	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날아가는중");

	}

}

public class Main7 {

	public static void main(String[] args) {

		ArrayList<Vehicle> Vehicles = new ArrayList<>();

		Vehicles.add(new Car());
		Vehicles.add(new Airplane());

		for (Vehicle veh : Vehicles) {
			veh.move();

			if(veh instanceof Flyable) {
				Flyable fly = (Flyable) veh;
				fly.fly();
			}
		}
	}
}
