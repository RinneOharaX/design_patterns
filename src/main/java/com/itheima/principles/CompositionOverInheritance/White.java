package com.itheima.principles.CompositionOverInheritance;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 15:01
 */
public class White implements Color{
    @Override
    public void mycolor() {
        System.out.println("我是白色轿车");
    }

    @Override
    public String toString() {
        return "White";
    }
}
