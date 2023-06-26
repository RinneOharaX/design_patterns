package com.itheima.principles.liskovsubstitution;

import com.itheima.principles.openclose.DemoTest01;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 16:35
 */
public class DemoTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(20,10);
        DemoTest.resize(rectangle);
        DemoTest.printLengthAndWidth(rectangle);

        Rectangle square=new Square();
        square.setLength(10);
        DemoTest.resize(square);
        square.setWidth(20);
        DemoTest.printLengthAndWidth(square);

    }
    public static void  resize(Rectangle rectangle){
        double temp=0;
        while(rectangle.width<rectangle.length){
        rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
