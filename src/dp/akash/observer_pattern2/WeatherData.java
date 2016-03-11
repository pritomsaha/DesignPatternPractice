package dp.akash.observer_pattern2;

import java.util.Observable;

/**
 * Created by Akash on 09-Mar-16.
 */
public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChange(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
