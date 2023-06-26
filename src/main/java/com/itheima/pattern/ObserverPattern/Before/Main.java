package com.itheima.pattern.ObserverPattern.Before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 14:30
 */
public class Main {
    public static void main(String[] args) {
        CurrentCondition currentCondition=new CurrentCondition();
        currentCondition.setData(30,40,130);
    }
}
