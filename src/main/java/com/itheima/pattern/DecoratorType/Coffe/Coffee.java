package com.itheima.pattern.DecoratorType.Coffe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:14
 */

public class Coffee extends Drink {
    public int cost(){
        return super.getPrice();
    }
}
