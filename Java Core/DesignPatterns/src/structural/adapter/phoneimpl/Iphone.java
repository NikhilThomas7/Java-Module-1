package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {

	private boolean connector;

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("connect lightning");
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public void useLightning() {
		connector = true;
		System.out.println("lightning connected");
		// TODO Auto-generated method stub

	}

}
