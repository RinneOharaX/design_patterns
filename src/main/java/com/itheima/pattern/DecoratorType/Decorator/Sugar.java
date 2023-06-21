package com.itheima.pattern.DecoratorType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:20
 */
public class Sugar extends Decorator {
    public int cost(Integer count){
        return 1*count+super.getDrink().cost();
    }
}
