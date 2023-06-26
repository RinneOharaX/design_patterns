package com.itheima.pattern.MediatorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 16:58
 */
public class Tv  extends Colleague{
    public Tv(Mediator mediator,String name){
        super(mediator,name);
        mediator.register(name,this);
    }
    @Override
    public String sendMessage(int stateChange) {
        String ans="";
        if (stateChange==0){
            ans="Tv关闭";
        }else if (stateChange==1){
            ans="Tv开启";
        }
        return ans;
    }
}
