package com.itheima.principles.isolation.before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 13:53
 */

//建立一个A类，其中拥有2个方法，分别为方法1，方法2
public class A {
    public void method1(){
        System.out.println("我是方法1");
    }
    public void method2(){
        System.out.println("我是方法2");
    }
}
