package listdemo;

import java.util.HashSet;
import java.util.Iterator;



public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet <String> bookSet = new HashSet<String>();
		bookSet.add("java in nutshell");
		bookSet.add("java complete reference");
		bookSet.add("thinking in java");
		bookSet.add("Java in 21 days");
		bookSet.add("java for dummys");
		bookSet.add(null);
		bookSet.add(null);
		bookSet.add(null);
		bookSet.add(null);
		
				
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java in nutshell"));
		
		bookSet.add("thinking in java");
		System.out.println(bookSet.size());
		
		for(String book : bookSet) {
			System.out.println(book);
			
		}
		
		Iterator<String> iter =  bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
