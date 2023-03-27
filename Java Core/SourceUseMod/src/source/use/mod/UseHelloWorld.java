package source.use.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {
	public static void main(String[] args) {
		
//		var x =18;
//		var y ="ghhh";
		
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
