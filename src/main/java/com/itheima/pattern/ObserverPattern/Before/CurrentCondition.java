package com.itheima.pattern.ObserverPattern.Before;

import lombok.Data;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 14:24
 */
@Data
public class CurrentCondition {
    private float temperature;
    private float humidity;
    private float pressure;

    private  WeatherData weatherData=new WeatherData();


    public void  dataChange(){
        weatherData.updateWeather(getTemperature(),getHumidity(),getPressure());
    }
    public void  setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
         dataChange();
    }
}
