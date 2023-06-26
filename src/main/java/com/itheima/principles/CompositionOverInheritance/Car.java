package com.itheima.principles.CompositionOverInheritance;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 14:48
 */
public class Car{
    //此处组合颜色接口也体现了依赖倒转原则
    private  Color color;
    private  String funtion;

    public Car(Color color, String funtion) {
        this.color = color;
        this.funtion = funtion;
    }

    public Car() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", funtion='" + funtion + '\'' +
                '}';
    }
}
