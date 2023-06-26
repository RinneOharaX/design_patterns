package com.itheima.pattern.MediatorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 16:59
 */
public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator,String name){
        super(mediator,name);
        mediator.register(name,this);
    }
    @Override
    public String sendMessage(int stateChange) {
        String ans="";
        if (stateChange==0){
            ans="咖啡机关闭";
        }else if (stateChange==1){
            ans="咖啡机开启";
        }
        return ans;
    }
}
