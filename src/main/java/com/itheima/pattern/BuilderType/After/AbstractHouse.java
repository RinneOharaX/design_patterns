package com.itheima.pattern.BuilderType.After;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:17
 */

//抽象层规定通用的一些方法，让子类去重写，并且通过build方法返回基础类，方便得到子类的各种属性
public abstract class AbstractHouse {
    protected House house= new House();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public House build(){
      return  house;
    }

}
