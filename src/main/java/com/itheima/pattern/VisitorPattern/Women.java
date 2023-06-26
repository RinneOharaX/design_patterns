package com.itheima.pattern.VisitorPattern;

import lombok.*;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:08
 */

@EqualsAndHashCode(callSuper = true)
public class Women extends Person{
    public Women() {
    }

    public Women(String name, Aciton aciton) {
        super(name,aciton);
    }

    @Override
    public void  accept(Aciton aciton){
        aciton.getWomenResult(this);
    }
}
