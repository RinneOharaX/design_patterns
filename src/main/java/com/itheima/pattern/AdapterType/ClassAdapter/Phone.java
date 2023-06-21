package com.itheima.pattern.AdapterType.ClassAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 11:06
 */
//调用类中传入Target，因为Target类实现了适配器的接口，并且继承了被转换者。可以同时调用两者的方法

public class Phone {
    public void charging(Adapter adapter){
        if (adapter.output5V()==5){
            System.out.println("电压正确可以完成充电");
        }else if (adapter.output5V()>5){
            System.out.println("危险电压，不能充电");
        }
    }
}
