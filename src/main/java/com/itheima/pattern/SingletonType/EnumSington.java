package com.itheima.pattern.Singleton;

/*枚举单例模式，最为推荐的一种单例模式，写法极其简单，利用了JVM的特性去实现单例，还能防止单例被破坏（一般是指序列化和反射）
* 枚举类能成单例设计模式，是因为枚举类本身是一个线程安全，且单实例的类
* 唯一唯一的遗憾就是，枚举类属于饿汉单例模式，内存有些许浪费*/
public enum EnumSington {
    INSTANCE;
}
