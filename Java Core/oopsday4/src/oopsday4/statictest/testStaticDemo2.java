package oopsday4.statictest;

public class testStaticDemo2 {
	
	public static void main(String[] args) {
		staticDemo2 obj1 = new staticDemo2();
		obj1.method();
		staticDemo2.method();	
//		staticDemo2.method2();	
		obj1.method2();
	}
	
	public static void method3() {
		staticDemo2 obj1 = new staticDemo2();
		obj1.method();
		staticDemo2.method();	
		obj1.method2();	
		
	}
}
