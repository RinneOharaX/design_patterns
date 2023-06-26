package com.itheima.pattern.MementoPattern;

import com.itheima.principles.isolation.before.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 13:55
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }
    //根据索引值寻找相应的备忘录
    public Memento get(int index){
        return mementoList.get(index);
    }
}
