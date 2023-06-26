package com.itheima.principles.dependenceInversion.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 17:41
 */
public class InterCPU implements CPU {
    public void  run(){
        System.out.println("IntelCPU运行");
    }
}
