package com.itheima.pattern.VisitorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:11
 */
public class Fail extends Aciton{
    @Override
    public void getManResult(Man man) {
        System.out.println(man+"演出失败");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println(women+"演出失败");
    }
}
