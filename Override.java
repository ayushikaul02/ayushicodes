package ayushicodes;

class Vehicle{
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	public void run() {
		System.out.println("Bike is running");
	}
}
class Car extends Vehicle{
	public void run() {
		System.out.println("Car runs");
	}
}

public class Override {
	public static void main(String[] args) {
		Vehicle v1= new Bike();
		Vehicle v2= new Car();
		v1.run();
		v2.run();
	}

}
