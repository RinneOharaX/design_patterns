package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:06
 */
public class ShortBlack extends Coffee {

    public ShortBlack(){
        this.setDescription("短黑咖啡");
    }

    public int cost(){
        return 20;
    }
}
