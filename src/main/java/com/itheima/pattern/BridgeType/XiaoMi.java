package com.itheima.pattern.BridgeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 14:59
 */
public class XiaoMi implements Bridge{
    @Override
    public void call() {
        System.out.println("小米手机");
    }
}
