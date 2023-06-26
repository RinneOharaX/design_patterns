package com.itheima.pattern.MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 13:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//用于从备忘录中还原信息
public class Originator {
    private String state;
//将当前的装填存储至一个新的备忘录
    public Memento saveStateToMemento(){
        Memento memento=new Memento(state);
        return  memento;
    }
//从指定的备忘录中还原信息
    public void getStateFromMemento(Memento memento){
        state= memento.getState();
    }
}
