package com.itheima.pattern.ProtoTyple.FactoryType.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:48
 */
public class BJCheesePizza extends Pizza {
    public BJCheesePizza(){
        setPizzaName("北京奶酪披萨");
    }
    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"准备原材料中...");
    }
}
