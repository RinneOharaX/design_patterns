package com.itheima.pattern.ProxyType.StaticProxy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 15:22
 */

public class Main {
    public static void main(String[] args) {
        //通过代理对象去完成上课
        ITeacherDao proxyTeacher=new ProxyTeacher(new Teacher("english"));
        proxyTeacher.teach();
    }
}
