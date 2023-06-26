package com.itheima.pattern.FacadeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 11:34
 */
public class Porcorn  {
    private Porcorn (){};

    private static Porcorn porcorn=new Porcorn();

    public static Porcorn getInstance(){
        return  porcorn;
    }

    public void on(){
        System.out.println("爆米花机开启...");
    }

    public void off(){
        System.out.println("爆米花机关闭...");
    }
    public  void  play(){
        System.out.println("爆米花机运行...");
    }
}
