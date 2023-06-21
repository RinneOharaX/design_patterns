package com.itheima.pattern.Factory.FactoryMethod;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:44
 */
public class BJGreekPizza extends Pizza {
    public BJGreekPizza(){
        setPizzaName("北京希腊披萨");
    }
    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"准备原材料中...");
    }
}
