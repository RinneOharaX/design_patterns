package com.itheima.pattern.Factory.FactoryMethod;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:53
 */
//根据输入的地点选择对应位置的披萨
public class PizzaFactroy {
    Pizza pizza=null;
    public Pizza getPizzaFactory(String location, String orderType){
        if (location.equals("BJ")){
            pizza=new BJPizzaFactory().getPizza(orderType);
        } else if (location.equals("SH")) {
            pizza=new SHPizzaFactroy().getPizza(orderType);
        }else{
            throw new RuntimeException("输入的地名不支持！");
        }
        return pizza;
    }
}
