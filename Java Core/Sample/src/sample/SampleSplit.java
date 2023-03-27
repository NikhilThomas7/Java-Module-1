package sample;

import java.util.Scanner;

public class SampleSplit {

	public static void main(String[] args) {
		int singleamount =0;
		int sum =0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input the limit amount");
		int limit = sc.nextInt();
		System.out.println("enter the num of splits  ");
		int splitcount = sc.nextInt();
		for(int i=1;i<=splitcount;i++) {
			System.out.println(i+"st person input");
			 singleamount = sc.nextInt();
			 sum = sum+ singleamount; 	
		}
//		System.out.println(sum);
		if(sum == limit) {
			System.out.println("everything correct");
		}else if(sum > limit){
			System.out.println("amount exceeded..!!");
		}else if(sum < limit) {
			System.out.println("amount not met");
			
		}
		
		
		
		
				
	}

}
