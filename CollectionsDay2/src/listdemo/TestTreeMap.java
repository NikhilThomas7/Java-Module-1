package listdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestTreeMap {

	public static void main(String[] args) {
		
		HashMap<String,String> countryCurr = new HashMap<>();
		
		countryCurr.put("ind", "rupe");
		countryCurr.put("usa", "dollars");
		countryCurr.put("uk", "pound");
		countryCurr.put("null", "null");
		System.out.println(countryCurr);
		
		System.out.println(countryCurr.get("ind"));
		
		countryCurr.put("ind", "rupeee");
		System.out.println(countryCurr);
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("uk"));
		
		//Hashmap has 3 views
		//1. key view
		
		Set<String> keys = countryCurr.keySet();
		for (String key : keys) {
			System.out.println(key);
			
		}
		
		//2.values view
		Collection<String> values = countryCurr.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		
		//3.key values together EntrySet
		Set<Entry<String,String>> entries = countryCurr.entrySet();
		for(Entry entry : entries) {
			System.out.println(entry);
		}
				
				
				
		

	}

}
