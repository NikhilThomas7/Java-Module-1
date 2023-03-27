package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		List <String> strings = Arrays.asList("andhra","kerala","tamilnadu","karnataka");
		
	
		
		Function <String,String> f3 = (str1)->{
			
			return str1.toUpperCase();
		};
		System.out.println(f3.apply("ust global"));
		
		Function <Integer,Integer> f2 =(n)->{
			
			return n*n;
			
		};
		System.out.println(f2.apply(5));
		
		
		Function <String,Integer> f =(str)-> {
												return str.length();
		};
		System.out.println(f.apply("hello world"));
//		for(String str : strings) {
//			System.out.println(f.apply(str));
//		}

	}

}
