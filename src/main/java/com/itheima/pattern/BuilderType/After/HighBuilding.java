package com.itheima.pattern.BuilderType.After;


/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:31
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        house.setBase(40);
        System.out.println("建造高层房子地基...");
    }

    @Override
    public void buildWall() {
        house.setWall(30);
        System.out.println("建造高层房子砌墙...");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed(20);
        System.out.println("建造高层房子封顶...");
    }



}
