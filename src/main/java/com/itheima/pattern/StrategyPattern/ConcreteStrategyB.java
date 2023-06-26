package com.itheima.pattern.StrategyPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:30
 */
public class ConcreteStrategyB implements  Strategy{
    @Override
    public void show() {
        System.out.println("双十一大促");
    }
}
