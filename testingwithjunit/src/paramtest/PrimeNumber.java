package paramtest;

public class PrimeNumber {

	public boolean validate (int k) {
		int i=1;
		int count =0;
		int n=5;
		
		while(n%i==0 && i<=n) {
			count = count +1;
			
			i++;
			
		}
		if(count ==2)
		return false;
		else
			return true;
		
	}

}
