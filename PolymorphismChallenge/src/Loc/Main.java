package Loc;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("2022 Blue Ferrari 296 GTS");
		runRace(car);
		GasPoweredCar ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 14.5, 6);
		runRace(ferrari);
		System.out.println("----====----====----====");
		Car tesla = new ElectricCar("2022 Red Tesla Model 3", 567, 75);
		runRace(tesla);
		
		System.out.println("----====----====----====");
		Car ferrariHybrid = new HybridCar("2022 Black Ferrari Car", 16, 8, 8);
		runRace(ferrariHybrid);
		
	}
	
	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}

}
