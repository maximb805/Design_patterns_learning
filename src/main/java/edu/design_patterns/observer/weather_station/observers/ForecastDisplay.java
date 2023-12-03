package edu.design_patterns.observer.weather_station.observers;

import edu.design_patterns.observer.weather_station.weather_data.WeatherData;
import edu.design_patterns.observer.weather_station.weather_data.WeatherDataSubject;

public class ForecastDisplay implements WeatherDataObserver, WeatherDataDisplay {

    private final WeatherDataSubject weatherDataSubject;
    private double forecasted_temperature;
    private double forecasted_pressure;
    private double forecasted_humidity;

    public ForecastDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        this.weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {
        if (weatherDataSubject instanceof WeatherData weatherData) {
            forecasted_temperature = weatherData.getTemperature() > 25 ?
                    weatherData.getTemperature() - 0.3 : weatherData.getTemperature() + 0.3;
            forecasted_pressure = weatherData.getPressure() > 762 ?
                    weatherData.getPressure() - 0.3 : weatherData.getPressure() + 0.3;
            forecasted_humidity = weatherData.getHumidity() > 92 ?
                    weatherData.getHumidity() - 0.5 : weatherData.getHumidity() + 0.5;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast Display Info:");
        System.out.println("Temperature: " + forecasted_temperature);
        System.out.println("Pressure: " + forecasted_pressure);
        System.out.println("Humidity: " + forecasted_humidity);
        System.out.println();
    }
}
