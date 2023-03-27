package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		List <String> strings = Arrays.asList("andhra","kERAla","taMILNadu","karNATaka");
		
		Function <String,Integer> f =(str)-> {
			return str.length();

		};
		
		Function <String,String> f1 =(str)-> {
			return str.toLowerCase();

		};
		
		Function <String,String> f2 =(str)-> {
			return str.toUpperCase();

		};
		
		Function <String,String> f3 =(str)-> {
			return str.toUpperCase();

		};
//		for(String str : strings) {
//		System.out.println(f.apply(str));
//	}
		printlength(strings,f);
		printuppercase(strings,f1);
		printlowercase(strings,f2);
		printreverse(strings,f3);

		
}
	public static void printlength(List<String> strings,Function <String,Integer> fRef) {
		
		
		for(String str : strings) {
		System.out.println(str +fRef.apply(str));
	}
	}
	
	public static void printuppercase(List<String> strings,Function <String,String> f) {
		
		
		for(String str : strings) {
		System.out.println(f.apply(str));
	}
	}
	
	public static void printlowercase(List<String> strings,Function <String,String> f) {
		
		
		for(String str : strings) {
		System.out.println(f.apply(str));
	}
	}

	public static void printreverse(List<String> strings,Function <String,String> f) {
		
		
		for(String str : strings) {
		System.out.println(f.apply(str));
	}
	}




}
