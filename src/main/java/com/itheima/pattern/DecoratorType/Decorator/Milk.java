package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:20
 */
public class Milk  extends Decorator{
    public int cost(Integer count){
        return 10*count+super.getDrink().cost();
    }
}
