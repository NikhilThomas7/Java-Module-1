package FactoryMethod;

public class UseVehicleFactory {
	public static void main(String[] args) {
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		seltos.honk();
		
		Vehicle xcross = VehicleFactory.newInstance("XCross");
		xcross.move();
		
		
		
	}

}
