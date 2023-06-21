package com.itheima.pattern.TestSingleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/23 16:43
 */
public class StaticSingleton {
    private StaticSingleton(){};

    public static class Singleton{
        private static final Singleton singleton=new Singleton();
    }

    public static Singleton getSingleton(){
        return Singleton.singleton;
    }
}
