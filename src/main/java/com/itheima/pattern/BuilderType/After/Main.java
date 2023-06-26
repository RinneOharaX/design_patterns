package com.itheima.pattern.BuilderType.After;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:37
 */
public class Main {
    public static void main(String[] args) {
        HouseDirecotr houseDirecotr=new HouseDirecotr();
        houseDirecotr.setAbstractHouse(new CommonHouse());
        House commonHouse = houseDirecotr.getHouse();
        System.out.println(commonHouse);
        houseDirecotr.setAbstractHouse(new HighBuilding());
        House highbuilding = houseDirecotr.getHouse();
        System.out.println(highbuilding);

    }
}
