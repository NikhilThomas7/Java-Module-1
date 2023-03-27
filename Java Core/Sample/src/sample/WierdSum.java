package sample;

public class WierdSum {
	public static void main(String[] args) {
		int sum =0;
		
		int[] array = {3,2,3,4,1};
		int wsumof = 4;
		
		for(int i=0;i<array.length;i++) {
			 sum = sum + array[i];
		}
		int result = sum - wsumof;
		System.out.println(result);
		
		
		
	}

}
