package com.itheima.pattern.Factory.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:53
 */
//根据输入的地点选择对应位置的披萨
public interface PizzaFactroy {
    public Pizza getPizzaFactory(String orderType);

}
