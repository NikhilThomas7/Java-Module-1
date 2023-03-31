package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("connect microusb");
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public void useMicroUsb() {
		connector = true;
		System.out.println("Microusb connected");
		// TODO Auto-generated method stub

	}

}
