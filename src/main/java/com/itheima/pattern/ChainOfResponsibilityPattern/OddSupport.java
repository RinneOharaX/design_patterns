package com.itheima.pattern.ChainOfResponsibilityPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:44
 */

public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return (trouble.getNumber() % 2) == 1;
    }

}

