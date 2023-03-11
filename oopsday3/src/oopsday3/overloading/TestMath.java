package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		Math obj1 = new Math();
		int result = obj1.add(5,7);
		System.out.println(result);
		
		result = obj1.add(5,7,10);
		System.out.println(result);
		
		result = obj1.add(5,7,10);
		System.out.println(result);
		
	double 	result2 = obj1.add(6.5, 8.6);
	System.out.println(result2);
	
	 	result2 = obj1.add(6.5, 8.6,9.0);
	System.out.println(result2);
	
	result2 = obj1.add(6L, 8L,9L);
	System.out.println("float  " +result2);
				
		
		// TODO Auto-generated method stub

	}

}
