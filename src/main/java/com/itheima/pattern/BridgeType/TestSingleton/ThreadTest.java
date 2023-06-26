package com.itheima.pattern.BridgeType.TestSingleton;

import java.util.concurrent.Callable;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/27 16:05
 */
public class ThreadTest implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        return null;
    }
}
