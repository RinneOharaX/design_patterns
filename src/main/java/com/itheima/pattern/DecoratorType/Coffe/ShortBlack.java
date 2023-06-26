package com.itheima.pattern.DecoratorType.Coffe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:06
 */

public class ShortBlack extends Coffee {
    public ShortBlack(){
        setDescription("短黑咖啡");
        setPrice(19);
    }
    public int cost(){
        return super.getPrice();
    }
}
