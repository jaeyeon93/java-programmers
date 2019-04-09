package designpattern.chpater2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private ArrayList<Observer> observers;
    private float templerature;
    private float humidity;
    private float pressure;

    public WeatherData() { }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float templerature, float humidity, float pressure) {
        this.templerature = templerature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemplerature() {
        return templerature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
