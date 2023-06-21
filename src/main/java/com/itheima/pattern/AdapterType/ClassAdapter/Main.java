package com.itheima.pattern.AdapterType.ClassAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 11:06
 */

//传入Target的对象，让Phone类中的方法进行调用0
public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new Voltage5V());
    }
}
