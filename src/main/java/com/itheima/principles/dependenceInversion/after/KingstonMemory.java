package com.itheima.principles.dependenceInversion.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 17:41
 */
public class KingstonMemory implements Memory{
    public void save(){
        System.out.println("Kingston内存条保存数据");
    }
}
