package com.itheima.pattern.ChainOfResponsibilityPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:41
 */
public class Trouble {

    private int number;

    public Trouble( int number){
        this.number=number;
    }
    public int getNumber() {
        return number;
    }
    public String toString(){
        return "问题编号：["+number+"]";
    }

}
