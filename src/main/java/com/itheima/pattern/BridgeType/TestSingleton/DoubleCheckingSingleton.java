package com.itheima.pattern.TestSingleton;

import java.io.Serializable;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/23 16:37
 */
public class DoubleCheckingSingleton implements Serializable {
    private static boolean flag=false;
    private DoubleCheckingSingleton(){
        if (flag){
            throw new RuntimeException("对象已经创建");
        }
        flag=true;
    };

    private static volatile DoubleCheckingSingleton doubleCheckingSingleton=null;

    public static  DoubleCheckingSingleton getDoubleCheckingSingleton(){
        if (doubleCheckingSingleton==null){
            synchronized (DoubleCheckingSingleton.class){
                if (doubleCheckingSingleton==null){
                    doubleCheckingSingleton=new DoubleCheckingSingleton();
                }
            }
        }
        return doubleCheckingSingleton;
    }
    public Object readResolve(){
        return doubleCheckingSingleton;
    }
}
