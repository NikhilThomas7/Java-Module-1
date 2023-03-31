package observer.main.test;

import observer.consumers.NewsPapers;
import observer.consumers.TVChannel;
import observer.subjectimpl.WeatherStation;

public class TestObserver {
	public static void main(String[] args) {
		TVChannel observer1 = new TVChannel(); // subscriber
		NewsPapers observer2 = new NewsPapers(); // subscriber
		TVChannel observer3 = new TVChannel();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);
	}

}
