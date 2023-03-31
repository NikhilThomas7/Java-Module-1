package observer.consumers;

import observer.ifaces.WeatherObserver;

public class TVChannel implements WeatherObserver {
	@Override
	public void doUpdate(int temperature) {
		System.out.println("TV Channel updating temperature as "+temperature);
		
	}

}
