package com.itheima.pattern.DecoratorType.Decorator;

import com.itheima.pattern.DecoratorType.Coffe.Drink;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:20
 */

public class Milk  extends Decorator{

    public Milk(Drink drink){
        super(drink);
        setDescription("牛奶");
        setPrice(10);
    }

}
