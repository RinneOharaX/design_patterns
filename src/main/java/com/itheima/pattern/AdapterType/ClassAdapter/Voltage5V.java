package com.itheima.pattern.AdapterType.ClassAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 10:59
 */
//适配器模式中的转换对象,需要去继承被转换对象的方法，拿到其中的值进行转换处理，再返回一个转换后的值，并且要实现Adapter的接口
public class Voltage5V extends Voltage220V implements Adapter {
    @Override
    public int output5V(){
        int sourceV = output220V();
        int targetV= sourceV/44;
        return targetV;
    }
}
