package com.itheima.pattern.DecoratorType.Decorator;

import com.itheima.pattern.DecoratorType.Coffe.Drink;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:21
 */


public class Chocolate extends Decorator{
    public Chocolate(Drink drink){
        super(drink);
        setDescription("巧克力");
        setPrice(5);
    }
}
