package oopsday6exception;

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		System.out.println("program begins");
		try {
			int c =10/0;
			System.out.println("entered  try");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
//			System.out.println("from try to catch after exception ");
			
		}
				finally {
			System.out.println("from finally");
		}
		System.out.println("program ends");
	}

}
