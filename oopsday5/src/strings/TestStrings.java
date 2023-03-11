package strings;

public class TestStrings {
	
	
	

	public static void main(String[] args) {
		int count =0;
		int count1 =0;
		int count2 =0;
		
		
		byte bytes[]= {65,66,67,68,69};
		
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str = "welcome to ust";
		
		bytes = str.getBytes();
		for(byte b : bytes) {
			System.out.println(b);
		}
	char chars[] = {'u', 's', 't', 'g' };
	str = new String(chars);
	System.out.println(str);
	str.getChars(0, chars.length-1, chars, 1);
	for(char c : chars) {
		System.out.println(c);}
	
		String string = new String("she sell sea shells on the sea shore");
		System.out.println(string);
		
		String words[] = string.split("[s]");
		System.out.println(words.length);
		System.out.println(words.length);
		System.out.println(words);
		
		for(String word: words) {
			System.out.println(word);
		}
		
		string = new String("cartoon");
		System.out.println(string.startsWith("car"));
		System.out.println(string.endsWith("toon"));
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		
		System.out.println(apos);
		System.out.println(tpos);
		
		String string2 =  string.substring(apos, tpos);
		System.out.println(string2);
		
		
		
		string2 = string.substring(tpos);
		System.out.println(string2);
		
		string = new String("madamdam");
		int mpos = -1;
		int dpos = string.indexOf('d',-1);
		string2 = string.substring(dpos, string.length());
		System.out.println(string2);
		
		String email = new String("aneeta.roy@ust.com");
		int ipos = -1;
		int iipos = email.indexOf('c',-1);
		String email2 = email.substring(iipos, email.length());
		System.out.println(email2);
		
		String str1 = new String("welcome");
		String str2 = new String("weLCOME");
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		
		int val = str2.compareTo(str1);
		System.out.println(val);
		
		string = "Diehard";
		
		System.out.println(string.toLowerCase());
		System.out.println(string);
		
		
		string = "Diehard----12345ghgh--68h";
		for (int i=0;i<string.length();i++) {
			
			char x = string.charAt(i);
			
			if(Character.isAlphabetic(x)) {
				 
				count = count +1;
			}else if(Character.isDigit(x)){
				
				count1 = count1 + 1;
			}else {
				 
				count2 = count2 + 1;
				
			}
				
		}
		System.out.println("no of alphabets=" + count);
		System.out.println("no of digits=" + count1);
		System.out.println("no of other characters=" + count2);
	
			
}}
	


