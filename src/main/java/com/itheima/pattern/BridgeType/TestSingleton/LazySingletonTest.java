package com.itheima.pattern.BridgeType.TestSingleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/23 16:32
 */
public class LazySingletonTest {
    private LazySingletonTest(){};

    private static LazySingletonTest lazySingletonTest=null;

    public static LazySingletonTest getLazySingletonTest(){
        if (lazySingletonTest==null){
            lazySingletonTest=new LazySingletonTest();
        }
        return lazySingletonTest;
    }
}
