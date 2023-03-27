package sample;


public class Substring {
	

	public static void main(String[] args) {
		String S = "aaaaabcd";
		char arr[] = new char[128];
		int len = 1;
		char c;
		int count =0;
		int j=0;
		System.out.println(S.length());
		for(int i = 0;i<S.length();i++) {
			 c= S.charAt(i);
			arr[i]= c;
		}
		for(int i = 0;i<S.length();i++) {
			 System.out.println(arr[i]);
		}
		
		for(int i =0;i<S.length();i++) {
			for( j =i+1;j<S.length();j++) {
				if(arr[i]==arr[j]) {
					count = count + 1;
					break;
					
				
				}
			}
		}
		System.out.println( count);

	}

}
