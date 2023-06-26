package com.itheima.pattern.VisitorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:05
 */
public abstract class Aciton {
    //得到男性的测评,传入一个男性对象
    public abstract  void  getManResult(Man man);
    //得到女性测评，传入一个女性对象
    public abstract void getWomenResult(Women women);

}
