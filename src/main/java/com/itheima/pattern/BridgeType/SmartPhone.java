package com.itheima.pattern.BridgeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 14:59
 */
public class SmartPhone extends Phone{
    public void call(Bridge bridge){
        System.out.println("智能手机");
        bridge.call();
    }
}
