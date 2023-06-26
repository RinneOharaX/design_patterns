package com.itheima.pattern.MementoPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 14:10
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        //设置第一条状态（未添加至备忘录）
        originator.setState("State #1");
        //设置第二条状态（添加至备忘录的集合索引0）
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        //设置第三条状态（添加至备忘录的集合索引1）
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        //还原集合索引为0的状态
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        //还原集合索引为1的状态
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
