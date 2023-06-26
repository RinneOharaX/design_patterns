package com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:18
 */
public class GreekPizza extends Pizza {
    public GreekPizza(){
        setPizzaName("GreekPizza");
    }

    @Override
    public void prepare() {
        System.out.println(getPizzaName()+"正在准备中");
    }

}
