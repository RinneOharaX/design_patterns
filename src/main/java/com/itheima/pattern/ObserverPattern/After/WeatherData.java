package com.itheima.pattern.ObserverPattern.After;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 14:50
 */
@Data
@NoArgsConstructor
public class WeatherData implements Subjcet{
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;

    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void  setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private List<Observer> observerList=new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observerList){
            observer.update(temperature,humidity,pressure);
        }
    }
    public void display(){
        System.out.println("温度为---"+getTemperature());
        System.out.println("湿度为---"+getHumidity());
        System.out.println("气压为---"+getPressure());
    }
}
