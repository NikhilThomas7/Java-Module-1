package FactoryMethod;

public class XCross implements Vehicle {

	@Override
	public void start() {
		System.out.println("started.." + getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("stopped.." + getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("pom..pom.." + getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("its moving." + getClass());
		// TODO Auto-generated method stub

	}


}
