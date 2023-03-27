package sample;

import java.util.ArrayList;

public class LongestSubstring {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<String> arrlist = new ArrayList<>();
		String str ="abacad";
		System.out.println(str.length());
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				
				String substr1 = str.substring(i, j);
				int sublen = substr1.length();
				for(int ii=0;ii<sublen;ii++) {
					for(int jj=ii;jj<sublen;jj++) {
				
				if((substr1.charAt(ii)==substr1.charAt(jj)) ||( substr1.length() == 1)) {
					
					count =1;
					
					
					
					
				}
				
				if(count ==0) {
					arrlist.add(substr1);
					
					
					
				}
				
				
				
				
				
				
					}
				}
				
			}
		}
		System.out.println(arrlist);
		
		
	}

}
