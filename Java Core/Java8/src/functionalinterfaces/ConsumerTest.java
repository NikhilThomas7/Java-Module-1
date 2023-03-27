package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		List <String> strings = Arrays.asList("andhra pradesh","kERAla","taMILNadu","karNATaka");
	
		Consumer consumer = (str)->{
			
			System.out.println(str);
			
		};
		consumer.accept("im doing great");
		for(String str : strings) {
			consumer.accept(str);
		}
		
		printString(strings,consumer);
	
	
	
	
	
	
	
	
	
	
	}
	public static void printString(List<String> stri,Consumer con){
		
		for(String str1 : stri) {
			con.accept(str1);
			
		}
		
		
	}

}
