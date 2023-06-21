package com.itheima.pattern.Proxy.DynamicProxy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 16:33
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory factory=new ProxyFactory();
        factory.setTarget(new TearcherDao());
        ITeacherDao proxyInstance = factory.getProxyInstance();
        proxyInstance.teach("English");
    }
}
