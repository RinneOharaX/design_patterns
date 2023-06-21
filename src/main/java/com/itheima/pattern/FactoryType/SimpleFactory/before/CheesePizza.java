package com.itheima.pattern.Factory.SimpleFactory.before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:22
 */
public class CheesePizza extends Pizza {
    public CheesePizza (){
        setPizzaName("CheesePizza");
    }
    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"正在准备中...");
    }

}
