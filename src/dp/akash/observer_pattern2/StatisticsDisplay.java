package dp.akash.observer_pattern2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Akash on 09-Mar-16.
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private Observable observable;
    private int numberOfRecords;
    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;

    public StatisticsDisplay(Observable observable){
        this.observable=observable;
        this.observable.addObserver(this);
        this.avgTemperature=0f;
        this.numberOfRecords=0;
        this.maxTemperature=Integer.MIN_VALUE;
        this.minTemperature=Integer.MAX_VALUE;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            float currentTemperature=weatherData.getTemperature();
            numberOfRecords++;
            avgTemperature+=(currentTemperature-avgTemperature)/(float)numberOfRecords;
            maxTemperature=Math.max(maxTemperature,currentTemperature);
            minTemperature=Math.min(minTemperature, currentTemperature);
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+avgTemperature+"/"+maxTemperature+"/"+minTemperature);
    }
}
