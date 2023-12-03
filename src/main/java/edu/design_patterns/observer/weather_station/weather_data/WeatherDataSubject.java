package edu.design_patterns.observer.weather_station.weather_data;

import edu.design_patterns.observer.weather_station.observers.WeatherDataObserver;

public interface WeatherDataSubject {

    void registerObserver(WeatherDataObserver observer);
    void unregisterObserver(WeatherDataObserver observer);
    void notifyObservers();
}
