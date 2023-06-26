package com.itheima.pattern.VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:07
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Person {
    private String name;

    private Aciton aciton;

    public abstract void  accept(Aciton aciton);
}
