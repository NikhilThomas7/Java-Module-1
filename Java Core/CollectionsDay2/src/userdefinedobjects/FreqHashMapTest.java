package userdefinedobjects;

import java.util.Collection;
import java.util.HashMap;

public class FreqHashMapTest {

	public static void main(String[] args) {
		String str = "hello hello i i i hello bro";
		
		
//		System.out.println(str);
		String words[] = str.split(" ");
		System.out.println(words);
		System.out.println("total words: "+words.length);
		
		HashMap<String,Integer> str1 = new HashMap<>();
		
		
        for (String i : words) {
        	 
           
            Integer x = str1.get(i);
 
            if (x == null)
              
                str1.put(i, 1);
 
            else {
               
                str1.put(i, x + 1);
            }
        }
        System.out.println(str1);
        
        int i =12321;
        String str2= i+" ";
        StringBuilder sb = new StringBuilder(str2);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);
        boolean result = str2.equals(sb.toString());
        System.out.println(result);
        
        
        //conversionss
        
        int n =10;
        String s = new String("10");
        Integer integer = new Integer("10");
        String sint = s.valueOf(i);
        int m = Integer.parseInt(s);
        
        String s2 = integer.toString();
        integer = s2.intValue();
        		
        
        
        		
        
        		
        		
        		
	}

}
