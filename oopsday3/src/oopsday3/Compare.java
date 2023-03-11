package oopsday3;

public class Compare {

	public static void main(String[] args) {
		
		Rectangle r1 =new Rectangle();
		Rectangle r2 =new Rectangle();
		
		Triangle t1 =new Triangle();
		Triangle t2 =new Triangle();
				
		// comparing primitives
		
		int a =10; 
		int b= 35;
		
		boolean result = a==b;
		//comparing objects 1.comparing references 2.comparing members
		
		result = r1==r2;
		
		System.out.println(result); //false
		
//		boolean result1 = r1 == t1; // imcompatible type
		
//		System.out.println(result1);
		
		Rectangle r3 =r1;
		result = r3 == r1;
		System.out.println(result);
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		result = r1.equals(r3);//applicable only for objects and not for primitives
		System.out.println(result);
		
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		
		r2.setLength(35.5);
		r2.setBreadth(75.45);
		
		
		if(r1.getBreadth()==r2.getBreadth() && r1.getLength()== r2.getLength())
		{
			System.out.println("they are same");
		}else {
			System.out.println("they are not same");
		}
		
		System.out.println();
		
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS3(65.5);
		
		if(r1.getLength()==t1.getS1()) {
			System.out.println("lenth and s1 are same");
		}

	}}


