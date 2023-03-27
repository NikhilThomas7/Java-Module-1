package functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>() ;
		
		map.put("ola", "o");
		map.put("hello", "h");
		map.put("chao", "c");
		
		map.forEach((k,v) ->
		System.out.println(k +" for "+ v));
		
		BiConsumer <String,String> bi = (k,v)->{
			System.out.println(k +" for "+ v);
		};
		
		map.forEach(bi);
			
		
		
	}

}
