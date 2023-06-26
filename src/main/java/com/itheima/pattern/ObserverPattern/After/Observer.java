package com.itheima.pattern.ObserverPattern.After;


//由多个观测者共同去实现这个接口
public interface Observer {
    WeatherData weather=new WeatherData();
    public void update(float temperature,float humidity,float pressure);

}
