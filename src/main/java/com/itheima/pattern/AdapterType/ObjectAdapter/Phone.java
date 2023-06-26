package com.itheima.pattern.AdapterType.ObjectAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 12:56
 */
public class Phone {
    public void charging(Adapter adapter){
        int target = adapter.output5V();
        if (target==5){
            System.out.println("电压安全可以充电");
        }else {
            System.out.println("电压不正确");
        }
    }
}
