package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:07
 */
public class Decaf extends Coffee {

    public Decaf(){
        this.setDescription("摩卡");
    }


    public int cost(){
        return 18;
    }
}
