package designpattern.chpater2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float templerature;
    private float humidity;
    private Subject weatherData;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Currnetconditions : " + templerature + "F degrees and " + humidity + "humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.templerature = weatherData.getTemplerature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
