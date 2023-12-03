package edu.design_patterns.observer.weather_station.observers;

import edu.design_patterns.observer.weather_station.weather_data.WeatherData;
import edu.design_patterns.observer.weather_station.weather_data.WeatherDataSubject;

public class HeatIndexDisplay implements WeatherDataObserver, WeatherDataDisplay {

    private final WeatherDataSubject weatherDataSubject;
    private double heatIndex;

    public HeatIndexDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        this.weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {
        if (weatherDataSubject instanceof WeatherData weatherData) {
            computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
            display();
        }
    }

    private void computeHeatIndex(double t_celsius, double rh) {
        // в градусы по фаренгейту
        double t = (t_celsius * 9.0/5.0) + 32;
        heatIndex = 16.923 +
                (1.85212 * 0.1 * t) +
                (5.37914 * rh) -
                (1.00254 * 0.1 * t * rh) +
                (9.41695 * 0.001 * t * t) +
                (7.28898 * 0.001 * rh * rh) +
                (3.45372 * 0.0001 * t * t * rh) -
                (8.14971 * 0.0001 * t * rh * rh) +
                (1.02102 * Math.pow(10, -5) * t * t * rh * rh) -
                (3.8646 * Math.pow(10, -5) * Math.pow(t, 3)) +
                (2.91583 * Math.pow(10, -5) * Math.pow(rh, 3)) +
                (1.42721 * Math.pow(10, -6) * Math.pow(t, 3) * rh) +
                (1.97483 * Math.pow(10, -7) * t * Math.pow(rh, 3)) -
                (2.18429 * Math.pow(10, -8) * Math.pow(t, 3) * rh * rh) +
                (8.43296 * Math.pow(10, -10) * t * t * Math.pow(rh, 3)) -
                (4.81975 * Math.pow(10, -11) * Math.pow(t, 3) * Math.pow(rh, 3));
        heatIndex = (heatIndex - 32.0) * 5.0 / 9.0; // в градусы по цельсию
    }

    @Override
    public void display() {
        System.out.println("Heat Index Display:");
        System.out.println("Heat index: " + heatIndex);
        System.out.println();
    }
}
