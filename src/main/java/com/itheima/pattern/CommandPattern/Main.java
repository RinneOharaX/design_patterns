package com.itheima.pattern.CommandPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 13:44
 */
public class Main {
    public static void main(String[] args) {

        RemoteController remoteController=new RemoteController();
        //设置0号位的按钮为，开灯命令与关灯命令
        remoteController.setCommands(0,new LightOnCommand(new LightReceiver()),new LightOffCommand(new LightReceiver()));
        //调用0号位的开启按钮
        remoteController.onButton(0);
        //调用0号位的关闭按钮
        remoteController.offButton(0);
    }
}
