package quiz.q02;

import java.util.ArrayList;import oop.oop01.pack.C;

public class Drive {
	
	private ArrayList<Car> cars = new ArrayList<Car>();
	
 	public void addCar(Car car) {
 		cars.add(car);
 	}
 	
 	public void printeCars() {
 		for (Car car : cars) {
 			car.printInfo();
 		}
 	}
 	
 
}
