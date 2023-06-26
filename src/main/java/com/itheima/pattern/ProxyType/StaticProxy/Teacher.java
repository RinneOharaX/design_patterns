package com.itheima.pattern.ProxyType.StaticProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 15:20
 */

//此处为目标对象，需要实现共同的接口
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
public class Teacher implements  ITeacherDao{
    private String lesson;
    @Override
    public void teach() {
        System.out.println("上"+lesson+"课");
    }
}
