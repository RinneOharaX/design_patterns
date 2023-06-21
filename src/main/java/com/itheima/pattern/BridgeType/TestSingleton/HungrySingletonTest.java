package com.itheima.pattern.TestSingleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/23 16:28
 */
public class HungrySingletonTest {
    private HungrySingletonTest(){};
    private static HungrySingletonTest hungrySingletonTest=new HungrySingletonTest();

    public static HungrySingletonTest getHungrySingletonTest(){
        return hungrySingletonTest;
    }
}
