package com.itheima.principles.liskovsubstitution;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 16:30
 */
public class Square extends Rectangle{
    public Square(int i, int i1) {
    }

    public Square() {

    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
