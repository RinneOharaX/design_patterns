package com.itheima.pattern.FacadeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 11:36
 */
public class Projector {

    private Projector (){};

    private static Projector projector=new Projector();

    public static Projector getInstance(){
        return  projector;
    }

    public void on(){
        System.out.println("投影仪开启...");
    }

    public void off(){
        System.out.println("投影仪关闭...");
    }
    public  void  play(){
        System.out.println("投影仪运行...");
    }
}
