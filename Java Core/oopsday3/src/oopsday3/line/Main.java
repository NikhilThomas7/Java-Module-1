package oopsday3.line;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st coordinate");
		int a =sc.nextInt();
		int b =sc.nextInt();
		Draw p1 = new Draw(a,b);
		Main p3 = new Main();
		System.out.println("enter 2nd coordinate");
		 a =sc.nextInt();
		 b =sc.nextInt();
		Draw p2 = new Draw(a,b);
		DrawLine m1 = new DrawLine();
		m1.calline(p1.x,p2.x);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
