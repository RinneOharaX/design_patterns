package com.itheima.pattern.ObserverPattern.After;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 14:52
 */
public class BaiduObserver implements Observer{


    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("百度观察者调用气象信息....");
        weather.setWeatherData(temperature,humidity,pressure);
    }
}
