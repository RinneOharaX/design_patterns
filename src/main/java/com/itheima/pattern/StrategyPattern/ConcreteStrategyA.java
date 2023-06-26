package com.itheima.pattern.StrategyPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:29
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void show() {
        System.out.println("618大促");
    }
}
