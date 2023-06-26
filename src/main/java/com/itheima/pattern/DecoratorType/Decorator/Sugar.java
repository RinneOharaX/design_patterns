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

public class Sugar extends Decorator {
    public Sugar(Drink drink){
        super(drink);
        setDescription("糖");
        setPrice(1);
    }
}
