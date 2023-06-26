package com.itheima.pattern.MediatorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 16:26
 */
public abstract class Mediator {
    public abstract void register(String colleagueName,Colleague colleague);

    public abstract void getMessage(int stateChange,String colleagueName);

    public abstract void sendMessage();

}
