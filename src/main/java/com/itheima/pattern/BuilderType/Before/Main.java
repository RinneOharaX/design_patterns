package com.itheima.pattern.BuilderType.Before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 15:40
 */
public class Main {
    public static void main(String[] args) {
        AbstrractHouse common=new CommonHouse();
        common.build();
    }
}
