package com.itheima.pattern.ChainOfResponsibilityPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:45
 */
public class LimitSupport extends Support {

    private int limit;
    public LimitSupport(String name,int limit) {
        super(name);
        this.limit=limit;
    }

    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() <= limit;
    }

}
