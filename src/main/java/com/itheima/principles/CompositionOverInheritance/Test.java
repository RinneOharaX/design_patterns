package com.itheima.principles.CompositionOverInheritance;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 14:51
 */
public class Test {
    public static void main(String[] args) {
        Car electric=new ElectricCar(new White(),"电能车");
        System.out.println(electric.getColor());
    }
}
