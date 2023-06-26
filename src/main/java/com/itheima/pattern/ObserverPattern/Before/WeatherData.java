package com.itheima.pattern.ObserverPattern.Before;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 14:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;

    public void display(){
        System.out.println("温度为---"+getTemperature());
        System.out.println("湿度为---"+getHumidity());
        System.out.println("气压为---"+getPressure());
    }

    public void updateWeather(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }


}
