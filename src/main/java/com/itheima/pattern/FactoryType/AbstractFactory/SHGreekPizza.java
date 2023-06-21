package com.itheima.pattern.Factory.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 14:49
 */
public class SHGreekPizza extends Pizza {
    public SHGreekPizza(){
        setPizzaName("上海希腊披萨");
    }
    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"准备原材料中...");
    }
}
