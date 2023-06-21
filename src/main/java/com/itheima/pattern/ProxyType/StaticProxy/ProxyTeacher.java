package com.itheima.pattern.Proxy.StaticProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 15:21
 */
//此处为代理对象，也需要实现接口
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
public class ProxyTeacher implements ITeacherDao{

    //需要聚合被代理对象来使用它的方法。
    private ITeacherDao teacher;
    @Override
    public void teach() {
        //在此处可以增强原来的方法
        System.out.println("代理模式方法增强.....");
        teacher.teach();
    }
}
