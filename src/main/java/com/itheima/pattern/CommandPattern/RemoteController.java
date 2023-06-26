package com.itheima.pattern.CommandPattern;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 13:13
 */
//请求的发起者，与LightRecevier这个执行者是实现了解耦
public class RemoteController {
    int nums;
    private Command[] onCommands=new Command[5];

    private Command[] offCommands=new  Command[5];

    private Command undoCommand;
    
    public RemoteController(){
        for (int i = 0; i < onCommands.length; i++) {
            //为数组中个每一个都添加一个空命令，这样就省去的对数组的判空操作
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }
    //写一个set方法为Remote对象添加多种机器的命令，nums代表第几种机器的开关，以及对应的两种命令操作.
    public void setCommands(int nums,Command onCommand,Command offCommand){
        onCommands[nums]=onCommand;
        offCommands[nums]=offCommand;
    }

    //提供方法去调用
    public void  onButton(int nums){
        onCommands[nums].operate();
        undoCommand=onCommands[nums];
    }
    public void  offButton(int nums){
        undoCommand.undo();
    }

}
