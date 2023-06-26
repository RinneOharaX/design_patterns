package com.itheima.pattern.ProxyType.CglibProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 17:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
//利用Cglib代理本质是通过拦截器实现的，因此需要去实现MethodInterceptor接口
public class ProxyFactory implements MethodInterceptor {

    private  Object target;

    public Object getProxyInstance(){
        //调用一个工具类，设置它的父类（目标类）
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //增强方法
        System.out.println("cglib代理模式开启...");
        return  methodProxy.invoke(target,objects);
    }
}
