package com.itheima.pattern.VisitorPattern;

import lombok.*;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:08
 */
@EqualsAndHashCode(callSuper = true)
public class Man extends Person{
    public Man(String name,Aciton aciton) {
        super(name,aciton);
    }

    public Man() {
    }

    @Override
    public void  accept(Aciton aciton){
        aciton.getManResult(this);
    }
}
