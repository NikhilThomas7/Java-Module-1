package optionals;

import java.util.Optional;

public class TestOptional {
	
	public static void main(String[] args) {
		
		
		String str = null;
		String str1 = "hello";
		//Optional<String> optional =Optional.of(str);
		//System.out.println(optional.get());
		
		Optional<String> optional1 =Optional.ofNullable(str);
//		System.out.println(optional1.get());
		
		if(optional1.isPresent()) {
			System.out.println("value is present" + optional1.get());	
		}
		else {
//			System.out.println("value not present");
			System.out.println("value not present  " + optional1.orElse("str not initialized"));
		}
				
	}

}
