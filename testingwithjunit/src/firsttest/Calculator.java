package firsttest;

public class Calculator {
	
	public int power(int b, int e) {
		int p =1;
		int i =1;
		
		if(b==0 || e ==0) {
			return 0;
		}else {
			while(i<=e) {
				p *= b;
				i++;
			}
		}return p;
		
	}
	
	public int add(int b, int e) {
		
		
		int sum =0;
		
			sum = b+e;
			return sum;
			}
	

	public int sub(int b, int e) {
		
		
		int diff =0;
		
			diff = b-e;
			return diff;
			
	
}
	
}
		
		
		
	

	


