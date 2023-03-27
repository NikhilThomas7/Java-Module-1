package oopsday4.composition;

public class A {
	
	public A(int x, int y) {
		System.out.println(x+y);
		
		
		// TODO Auto-generated constructor stub
	}
	private int x =1;
	private int y=2;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
