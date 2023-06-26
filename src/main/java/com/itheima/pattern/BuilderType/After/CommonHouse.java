package com.itheima.pattern.BuilderType.After;



/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:21
 */

//在抽象类中完成方法的重写和对基础类的赋值
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        house.setBase(20);
        System.out.println("建造普通房子地基...");
    }

    @Override
    public void buildWall() {
        house.setWall(10);
        System.out.println("建造普通房子砌墙...");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed(5);
        System.out.println("建造普通房子封顶...");
    }


}
