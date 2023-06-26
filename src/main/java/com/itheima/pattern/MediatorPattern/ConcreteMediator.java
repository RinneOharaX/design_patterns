package com.itheima.pattern.MediatorPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 16:36
 */
public class ConcreteMediator extends Mediator{
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> messageMap;

    public ConcreteMediator(){
        colleagueMap=new HashMap<>();
        messageMap=new HashMap<>();
    }
    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        Colleague colleague = colleagueMap.get(colleagueName);
        messageMap.put(colleagueName,colleague.sendMessage(stateChange));
    }

    @Override
    public void sendMessage() {
        for (Map.Entry entry:colleagueMap.entrySet()){
            String s = messageMap.get(entry.getKey());
            System.out.println(s);
        }
    }
}
