package com.itheima.pattern.SingletonType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 15:22
 */

//饿汉式单例模式,静态方法属于类，所以类加载时候就能创建单例
public class HungrySingleton {
    //1.创建一个私有的构造器，目的就是不想让外界通过构造器创建对象
    private HungrySingleton(){}
    //2.由于不存在构造器创建对象，那么就要在类中自己创建一个唯一的静态对象供外界使用
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    //3.创建一个方法将这个静态对象返回
    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
