package com.itheima.pattern.DecoratorType;

import lombok.Data;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:14
 */
@Data
public abstract class Drink {
    private  String description;

    public abstract int cost();

}
