package com.itheima.pattern.Singleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 15:36
 */
public class SingletonTest {
    public static void main(String[] args) {
        //通过方法创建的对象都是相等，证明我们通过这两种方式创建的实例都是单例的
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        HungrySingleton hungrySingleton1= HungrySingleton.getHungrySingleton();
        System.out.println(hungrySingleton==hungrySingleton1);

        LazySingleton lazySingleton=LazySingleton.getLazySingleton();
        LazySingleton lazySingleton1=LazySingleton.getLazySingleton();
        System.out.println(lazySingleton==lazySingleton1);
    }
}
