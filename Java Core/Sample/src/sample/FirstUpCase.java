package sample;

import java.util.ArrayList;

public class FirstUpCase {
	public static void main(String[] args) {
		String str="joshua paulose";
		String[] arr1 = str.split(" ");
		String str1 = arr1[0];
		String str2 = arr1[1];
		System.out.println(str1);
		System.out.println(str2);
		ArrayList<Character> chararray =new ArrayList<Character>();
		ArrayList<Character> chararray1 =new ArrayList<Character>();
		for(int i =0;i<str1.length();i++) {
			chararray.add(str1.charAt(i));
			
		}
		chararray.set(0,'J');
//	String ar1str =	chararray.toString();
//	System.out.print(ar1str);
	
	for(int i =0;i<str2.length();i++) {
		chararray1.add(str2.charAt(i));
		
	}
	chararray1.set(0,'P');
String ar2str =	chararray1.toString();
System.out.println( " " +ar2str);

//create object of StringBuilder class
StringBuilder sb = new StringBuilder();

// Appends characters one by one
for (Character ch : chararray) {
    sb.append(ch);
}

// convert in string
String string1 = sb.toString();
System.out.println(string1 + "  ");

StringBuilder sb1 = new StringBuilder();

//Appends characters one by one
for (Character ch : chararray1) {
 sb1.append(ch);
}

//convert in string
String string2 = sb1.toString();
System.out.println( " " +string2);

System.out.println(string1+ " "+ string2);
	
	
	
		
	}

}
