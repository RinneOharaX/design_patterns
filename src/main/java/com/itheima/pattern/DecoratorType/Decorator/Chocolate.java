package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:21
 */
public class Chocolate extends Decorator{
    public int cost(Integer count){
        return 12*count;
    }


    @Override
    public int cost() {
        return 0;
    }
}
