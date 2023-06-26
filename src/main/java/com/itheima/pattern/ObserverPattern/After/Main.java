package com.itheima.pattern.ObserverPattern.After;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 15:06
 */
public class Main {
    public static void main(String[] args) {
        WeatherData subjcet=new WeatherData(30,40,150);
        subjcet.registerObserver(new BaiduObserver());
        subjcet.registerObserver(new SinaObserver());
        subjcet.notifyObservers();
    }
}
