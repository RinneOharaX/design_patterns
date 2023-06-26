package com.itheima.pattern.SingletonType;

import java.lang.reflect.Constructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 17:04
 */

/*此方法来介绍如何通过反射的方式去破坏单例模式
* 可以很明显的看到，通过反射获得的私有构造器创建的两个对象的地址值不相等，违反了单例模式，所以反射也能破坏单例模式
* 这个的原因是单例模式实现的一个关键点就是构造函数的私有性，反射攻击利用反射机制获取并修改构造函数的可见性，从而可以创建出新的实例，破坏单例*/
public class BreakSingtonByReflection {
    public static void main(String[] args) {
        Class<StaticInternalSingleton> clazz=StaticInternalSingleton.class;
        try {
            Constructor<StaticInternalSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            StaticInternalSingleton instance1 = constructor.newInstance();
            StaticInternalSingleton instance2 = constructor.newInstance();
            System.out.println(instance1==instance2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
