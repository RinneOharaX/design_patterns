package com.itheima.pattern.ObserverPattern.After;


//这个接口是观察者模式的核心接口，一共有三个方法
public interface Subjcet {
    //注册观察者
    public void registerObserver(Observer observer);
    //删除观察者
    public void removerObserver(Observer observer);
    //推送唤醒观察者
    public void notifyObservers();
}
