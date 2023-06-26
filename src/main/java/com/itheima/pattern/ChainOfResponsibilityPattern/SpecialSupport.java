package com.itheima.pattern.ChainOfResponsibilityPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:45
 */
public class SpecialSupport extends Support {

    public int specialNumber;
    public SpecialSupport(String name,int specialNumber) {
        super(name);
        this.specialNumber= specialNumber;
    }

    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == specialNumber;
    }

}

