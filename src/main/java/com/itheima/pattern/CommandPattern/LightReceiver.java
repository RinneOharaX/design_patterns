package com.itheima.pattern.CommandPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 13:08
 */
//解耦出命令的执行者，在这里写下命令的方法

public class LightReceiver {

    public void on(){
        System.out.println("执行电灯开启...");
    }

    public void off(){
        System.out.println("执行电灯关闭...");
    }
}
