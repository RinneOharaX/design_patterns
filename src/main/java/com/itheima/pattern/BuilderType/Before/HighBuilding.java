package com.itheima.pattern.BuilderType.Before;

import com.itheima.pattern.BuilderType.After.House;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 15:40
 */
public class HighBuilding extends AbstrractHouse{
    @Override
    public void bulidBasic() {
        System.out.println("创建高楼的地基...");
    }

    @Override
    public void buildWall() {
        System.out.println("创建高楼砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("创建高楼封顶...");
    }

    public House build(){
        super.build();
        return null;
    }
}
