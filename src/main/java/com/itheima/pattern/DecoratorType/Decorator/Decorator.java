package com.itheima.pattern.DecoratorType;

import lombok.Data;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:21
 */
@Data
//类中关联Drink类，调用各种不同的咖啡来计算价钱
public abstract class Decorator extends Drink{
    private String description;

    private Decorator decorator;

    //因为可以添加多份，所以需要个count
    public abstract int cost(Integer count);
}
