package com.itheima.pattern.DecoratorType.Coffe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.NestingKind;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:07
 */

public class Decaf extends Coffee {
    public Decaf(){
        setDescription("摩卡");
        setPrice(25);
    }
    public int cost(){
        return super.getPrice();
    }
}
