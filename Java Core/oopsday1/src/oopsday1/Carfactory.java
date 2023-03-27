package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jack = new Car();
		jack.color ="blue";
		jack.price = 3000000 ;
		jack.brand = "jeep";
		jack.model = "wrangler";
		System.out.println(jack.color );
		System.out.println(jack.price );
		System.out.println(jack.brand );
		System.out.println(jack.model);
		
		Car bmw = new Car();
		bmw.color ="black";
		bmw.price = 5000000 ;
		bmw.brand = "bmw";
		bmw.model = "x5";
		System.out.println("\n" );
		System.out.println(bmw.color );
		System.out.println(bmw.price );
		System.out.println(bmw.brand );
		System.out.println(bmw.model);
		
	}
	

}
