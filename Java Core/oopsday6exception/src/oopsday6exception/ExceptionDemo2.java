package oopsday6exception;

public class ExceptionDemo2 {
										//args is command line arguments
	public static void main(String[] args) {
		
		System.out.println("progrm task begins");
		try {
		int b = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int c =b/a;
		int data[]= {a,b};
		String name = args[2];
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("arrayindexofbound");
		e.printStackTrace();
	}catch(NumberFormatException e){
		e.printStackTrace();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
//		String name = args[2];
		
		System.out.println("progrm task completed");
		
	}

}
