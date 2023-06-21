package com.itheima.pattern.Proxy.CglibProxy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 17:19
 */

//利用Cglib代理的方式，则这个目标类不需药实现任何接口
public class TeacherDao {
    public void teach(String lesson){
        System.out.println("上"+lesson+"课....");
    }
}
