package com.itheima.pattern.ProtoTyple.FactoryType.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:50
 */
public class SHCheesePizza extends Pizza {
    public SHCheesePizza(){
        setPizzaName("上海奶酪披萨");
    }
    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"准备原材料中...");
    }
}
