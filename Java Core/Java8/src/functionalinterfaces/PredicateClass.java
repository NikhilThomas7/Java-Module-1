package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {
		List <String> strings = Arrays.asList("andhra pradesh","kERAla","taMILNadu","karNATaka");
		
		Predicate<String> p = (String str)->{
			
			return str.length()>10;
			
		};
		for(String str1 : strings) {
			System.out.println(p.test(str1));
		}
		
		desiredString(strings,p);
		
		
				

	}public static void desiredString(List<String> strings, Predicate <String> p) {
		
		for(String str2 : strings) {
			System.out.println(p.test(str2));
			
		}
		
	}

}
