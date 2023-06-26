package com.itheima.pattern.ProxyType.CglibProxy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 17:29
 */
public class Main {
    public static void main(String[] args) {
        TeacherDao target=new TeacherDao();

        ProxyFactory proxyFactory = new ProxyFactory(target);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        proxyInstance.teach("English");
    }
}
