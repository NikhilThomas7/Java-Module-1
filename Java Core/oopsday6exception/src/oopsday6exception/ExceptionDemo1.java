package oopsday6exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("program started");
		
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot / by zero");

		}catch (InputMismatchException e ) {
			System.out.println("invalid input");
		}kkk
		System.out.println("program completed");
	}

}
