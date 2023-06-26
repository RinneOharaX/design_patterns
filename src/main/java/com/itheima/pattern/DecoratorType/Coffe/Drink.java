package com.itheima.pattern.DecoratorType.Coffe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Drink {
    private  Integer Price;

    private  String description;

    public abstract int cost();

}
