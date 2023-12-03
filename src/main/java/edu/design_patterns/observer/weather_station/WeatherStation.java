package edu.design_patterns.observer.weather_station;

import edu.design_patterns.observer.weather_station.observers.CurrentConditionsDisplay;
import edu.design_patterns.observer.weather_station.observers.ForecastDisplay;
import edu.design_patterns.observer.weather_station.observers.HeatIndexDisplay;
import edu.design_patterns.observer.weather_station.observers.StatisticsDisplay;
import edu.design_patterns.observer.weather_station.weather_data.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(23, 762, 89);
        weatherData.setMeasurements(23.4, 761.7, 89.7);
        weatherData.setMeasurements(23.1, 761.3, 90.6);
        weatherData.setMeasurements(22.8, 761, 91.1);
        weatherData.setMeasurements(23.1, 760.6, 90.5);
    }
}
