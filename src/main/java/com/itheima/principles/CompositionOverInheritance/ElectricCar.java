package com.itheima.principles.CompositionOverInheritance;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 14:50
 */
public class ElectricCar extends Car{
    public ElectricCar(Color color, String funtion) {
        super(color, funtion);
    }

    public ElectricCar() {
    }

}
