package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


public class SupplierTest {
	
	public static void main(String[] args) {
		List <String> strings = Arrays.asList("andhra","kERAla","taMILNadu","karNATaka");
		
		Supplier <String> supplier = ()->{
			
			
			
			return new String("hola");
			
		};
//		for(String str: strings)
		System.out.println(supplier.get());
		
		fetchstrings(strings,supplier);
		
		
	} public static void fetchstrings(List<String> stri ,Supplier <String> sup ) {
		for(String str : stri) {
			System.out.println(sup.get());
			
			
		}
	}

}
