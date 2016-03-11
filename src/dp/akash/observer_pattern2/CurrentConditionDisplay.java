package dp.akash.observer_pattern2;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by Akash on 09-Mar-16.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable=observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            temperature=weatherData.getTemperature();
            humidity=weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degree and "+humidity+"% humidity");
    }
}
