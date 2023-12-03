package edu.design_patterns.observer.weather_station.observers;

import edu.design_patterns.observer.weather_station.weather_data.WeatherData;
import edu.design_patterns.observer.weather_station.weather_data.WeatherDataSubject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements WeatherDataObserver, WeatherDataDisplay {

    private final WeatherDataSubject weatherDataSubject;
    private double temperature;
    private double pressure;
    private double humidity;

    public CurrentConditionsDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        this.weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {
        // На самом деле мы на 100% уверены, что это WeatherData, но неизвестно,
        // сколько подобных субъектов может появиться в будущем
        if (weatherDataSubject instanceof WeatherData weatherData) {
            temperature = weatherData.getTemperature();
            pressure = weatherData.getPressure();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display Info:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Pressure: " + pressure);
        System.out.println("Humidity: " + humidity);
        System.out.println();
    }
}

class ForecastDisplay1 implements Observer, WeatherDataDisplay {
    private float currP = 29.92f;
    private float lastP;

    public ForecastDisplay1(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastP = currP;
            currP = (float)weatherData.getPressure();
            display();
        }
    }

    public void display() {
        // disp code here
    }
}
