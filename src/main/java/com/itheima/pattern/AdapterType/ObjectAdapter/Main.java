package com.itheima.pattern.AdapterType.ObjectAdapter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 12:57
 */
public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new Voltage5V());
    }
}
