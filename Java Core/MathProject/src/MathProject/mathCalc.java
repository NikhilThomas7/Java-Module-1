package MathProject;

public class mathCalc implements mathIface {
	
//	private int n;
//	
//	private mathCalc a = new mathCalc();
//	
//
//	
//	public mathCalc() {
//		// TODO Auto-generated constructor stub
//	}
//	
	

//	@Override
//	public String toString() {
//		return "mathCalc [n=" + n + "]";
//	}
//
//
//
//	public mathCalc(int n) {
//		this.n = n;
//	}
//
//
//
//	public int getN() {
//		return n;
//	}
//
//	public void setN(int n) {
//		this.n = n;
//	}

	@Override
	public void fact(int n) {
		int result =1;
		
		for(int i=1;i<=n;i++) {
			
			 result = i * result;
			
			
		}System.out.println("factorial =" + result);
		// TODO Auto-generated method stub

	}

	@Override
	public void prime(int n) {
		int i =1;
		int count =0;
//		while(i<=n) {
//			if(n%i==0) {
//				
//				count = count + 1;
//				i++;
//				
//			}
//			
//			}
		if(count ==2) {
				System.out.println(n + "is a factorial");
				
			}else {
				System.out.println(n + "is not a factorial");
		}
			
			
		// TODO Auto-generated method stub

	}

	@Override
	public void oddeven() {
		// TODO Auto-generated method stub

	}

	@Override
	public void arm() {
		// TODO Auto-generated method stub

	}

}
