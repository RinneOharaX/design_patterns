package com.itheima.pattern.BuilderType.Before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 15:38
 */
public class CommonHouse extends AbstrractHouse{
    @Override
    public void bulidBasic() {
        System.out.println("创建普通房子的地基...");
    }

    @Override
    public void buildWall() {
        System.out.println("创建普通房子砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("创建普通房子封顶...");
    }


}
