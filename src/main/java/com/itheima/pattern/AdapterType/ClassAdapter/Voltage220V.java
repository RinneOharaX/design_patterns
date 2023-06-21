package com.itheima.pattern.AdapterType.ClassAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 10:58
 */
//适配器模式中的被转化对象Source
public class Voltage220V {
    public int output220V(){
        int src=220;
        return src;
    }
}
