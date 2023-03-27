package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
	
		Car jack = new Car();
		jack.setColor("blue");
		jack.setPrice(300000);
		jack.setBrand("jeep");
		jack.setModel("wrangler");
		System.out.println(jack.getColor());
		System.out.println(jack.getPrice());
		System.out.println(jack.getBrand());
		System.out.println(jack.getModel());
//		System.out.println(Integer.toHexString(jack.hashCode()));
//		System.out.println(jack);
		
//		Car bmw = new Car();
//		bmw.color ="black";
//		bmw.price = 5000000 ;
//		bmw.brand = "bmw";
//		bmw.model = "x5";
//		System.out.println("\n" );
//		System.out.println(bmw.color );
//		System.out.println(bmw.price );
//		System.out.println(bmw.brand );
//		System.out.println(bmw.model);
//		
	}
	

}
