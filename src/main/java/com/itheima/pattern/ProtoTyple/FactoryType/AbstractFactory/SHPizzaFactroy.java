package com.itheima.pattern.ProtoTyple.FactoryType.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:52
 */
//用户已经选择了上海披萨，根据上海披萨再分披萨的种类
public class SHPizzaFactroy implements PizzaFactroy {
    Pizza pizza=null;
    @Override
    public Pizza getPizzaFactory(String orderType) {
        if (orderType.equals("GreekPizza")){
            pizza=new SHGreekPizza();
        }else if (orderType.equals("CheesePizza")){
            pizza=new SHCheesePizza();
        }else {
            throw new RuntimeException("输入的披萨种类有误");
        }
        return pizza;
    }
}
