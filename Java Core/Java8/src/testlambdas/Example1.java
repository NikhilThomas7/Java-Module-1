package testlambdas;

public class Example1 {
	
	interface Shape {
		
		double area();
		// 2 methods cannot be there in an interface
	}
	
	interface Math{
		
		double power(int b, int e);
		
	}
	
	interface factorial {
		int fact(int c);
	}
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r = ()->{
			for(int i =0;i<5;i++)
			{
				System.out.println("in run method");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		
		
		
		
		factorial f = (int c)->{
			int result =1;
			
			for(int i =1;i<=c;i++) {
				 result = result*i;
			}
			return result;
			
		};
		
		int result = f.fact(5);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		Math m = ( int b ,int  e)-> {
			
			int p =1;
			for (int i=0;i<=e;i++) {
				p *=b;
			}
			return p;
			
		};
		double p = m.power(2,3);
		System.out.println(p);
		
		Shape s = ()-> {
			return 0.0;
			};
		
		double result1 = s.area();
		System.out.println(result1);
		
	}

}
