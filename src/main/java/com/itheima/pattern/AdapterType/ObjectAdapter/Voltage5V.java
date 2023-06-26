package com.itheima.pattern.AdapterType.ObjectAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 12:52
 */
//区别就在于此处实现了接口之后，不要去继承Voltage220V，因为你只是单纯想调用其中的方法而不是有父子关系，那么就直接创造实例去获取转换前的值。
public class Voltage5V implements Adapter{

    private Voltage220V voltage220V;

    @Override
    public int output5V() {
        voltage220V=new Voltage220V();
        int sourceV = voltage220V.output220V();
        int targetV = sourceV/44;
        return targetV;

    }
}
