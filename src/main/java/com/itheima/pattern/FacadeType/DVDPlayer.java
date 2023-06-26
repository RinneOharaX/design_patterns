package com.itheima.pattern.FacadeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 11:30
 */

//可以做一个单例模式
public class DVDPlayer {

    private DVDPlayer(){};

    private static DVDPlayer dvdPlayer= null;

    public static DVDPlayer getInstance(){
        if (dvdPlayer==null){
            dvdPlayer=new DVDPlayer();
        }
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD开启...");
    }

    public void off(){
        System.out.println("DVD关闭...");
    }
    public  void  play(){
        System.out.println("DVD运行...");
    }
}
