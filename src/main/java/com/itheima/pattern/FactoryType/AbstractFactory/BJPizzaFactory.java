package com.itheima.pattern.Factory.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:52
 */
public class BJPizzaFactory implements PizzaFactroy {
    Pizza pizza=null;

    @Override
    public Pizza getPizzaFactory(String orderType) {
        if (orderType.equals("GreekPizza")){
            pizza=new BJGreekPizza();
        }else if (orderType.equals("CheesePizza")){
            pizza=new BJCheesePizza();
        }else {
            throw new RuntimeException("输入的披萨种类有误");
        }
        return pizza;
    }
}
