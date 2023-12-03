package edu.design_patterns.observer.weather_station.weather_data;

import edu.design_patterns.observer.weather_station.observers.WeatherDataObserver;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

// Этот класс считается существовавщей заранее программой,
// которая собирает данные метеостанции.
public class WeatherData extends Observable implements WeatherDataSubject {

    private final Set<WeatherDataObserver> observers = new HashSet<>();
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(WeatherDataObserver::update);
    }

    // Конкретно эти методы были реализованы заранее,
    // Нас не интересует, как они получают эти данные
    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    // Данный метод вызывается при каждом обновлении показаний датчиков
    // Тут мы размещаем свой код
    // (Предположим, что для нас он был подготовлен и где-то выше в программе используется)
    public void measurementsChanged() {
        notifyObservers();
    }
}
