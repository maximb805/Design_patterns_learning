package edu.design_patterns.observer.weather_station.observers;

import edu.design_patterns.observer.weather_station.weather_data.WeatherData;
import edu.design_patterns.observer.weather_station.weather_data.WeatherDataSubject;

import java.time.LocalDate;
import java.util.*;

public class StatisticsDisplay implements WeatherDataObserver, WeatherDataDisplay {

    private final WeatherDataSubject weatherDataSubject;
    private final List<Double> temperature_list = new LinkedList<>();
    private final List<Double> pressure_list = new LinkedList<>();
    private final List<Double> humidity_list = new LinkedList<>();
    private LocalDate today = LocalDate.now();

    public StatisticsDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        this.weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {
        if (LocalDate.now().getDayOfMonth() != today.getDayOfMonth()) {
            today = LocalDate.now();
            temperature_list.clear();
            pressure_list.clear();
            humidity_list.clear();
        }
        if (weatherDataSubject instanceof WeatherData weatherData) {
            temperature_list.add(weatherData.getTemperature());
            pressure_list.add(weatherData.getPressure());
            humidity_list.add(weatherData.getHumidity());
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Statistics Display Info:");
        System.out.println("Temperature:\n    AVG: " + temperature_list.stream().
                mapToDouble(a -> a).average().orElse(0) +
                "\n    MAX: " + temperature_list.stream().mapToDouble(a -> a).max().orElse(0) +
                "\n    MIN: " + temperature_list.stream().mapToDouble(a -> a).min().orElse(0));
        System.out.println("Pressure:\n    AVG: " + pressure_list.stream().
                mapToDouble(a -> a).average().orElse(0) +
                "\n    MAX: " + pressure_list.stream().mapToDouble(a -> a).max().orElse(0) +
                "\n    MIN: " + pressure_list.stream().mapToDouble(a -> a).min().orElse(0));
        System.out.println("Humidity:\n    AVG: " + humidity_list.stream().
                mapToDouble(a -> a).average().orElse(0) +
                "\n    MAX: " + humidity_list.stream().mapToDouble(a -> a).max().orElse(0) +
                "\n    MIN: " + humidity_list.stream().mapToDouble(a -> a).min().orElse(0));
        System.out.println();
    }
}
