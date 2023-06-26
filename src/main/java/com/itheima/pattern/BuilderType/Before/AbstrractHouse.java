package com.itheima.pattern.BuilderType.Before;

import com.itheima.pattern.BuilderType.After.House;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 15:34
 */

//因为不同房子的需求有所不同，所以创建一个抽象类，定义其中的抽象方法，让子类来继承重写其中的方法
public abstract class AbstrractHouse {

    public abstract void bulidBasic();

    public abstract void  buildWall();

    public abstract void roofed();

    public House build(){
        bulidBasic();
        buildWall();
        roofed();
        return null;
    }
}
