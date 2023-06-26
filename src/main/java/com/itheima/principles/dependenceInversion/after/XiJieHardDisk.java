package com.itheima.principles.dependenceInversion.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 17:36
 */
public class XiJieHardDisk implements HardDisk{
    public void save(String data){
        System.out.println("XiJie硬盘保存数据");
    }
    public String  get(){
        System.out.println("XiJie硬盘获取数据");
        return "Data";
    }
}
