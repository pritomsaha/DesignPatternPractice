package dp.akash.observer_pattern2;

/**
 * Created by Akash on 09-Mar-16.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,29.2f);
        weatherData.setMeasurement(78,90,29.2f);
    }
}
