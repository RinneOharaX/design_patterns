package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:07
 */
public class Espresso extends Coffee {
    public Espresso (){
        this.setDescription("拿铁咖啡");
    }
    public int cost(){
        return 15;
    }
}
