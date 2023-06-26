package com.itheima.principles.isolation.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 13:57
 */
//建立两个最小的接口，如果B想调动方法1，那么就去实现接口1，想调用方法2，那么就去实现接口2。甚至两个都能够实现，这样是符合接口隔离的原则的
public class B implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("我是方法1");
    }

    @Override
    public void method2() {
        System.out.println("我是方法2");
    }
}
