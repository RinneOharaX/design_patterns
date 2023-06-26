package com.itheima.pattern.DecoratorType.Coffe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:07
 */

public class Espresso extends Coffee {
    public Espresso(){
        setPrice(20);
        setDescription("意大利咖啡");
    }

    public int cost(){
        return super.getPrice();
    }
}
