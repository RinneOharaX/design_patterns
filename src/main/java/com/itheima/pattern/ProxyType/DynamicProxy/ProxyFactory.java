package com.itheima.pattern.Proxy.DynamicProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 16:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProxyFactory {
    private  Object target;

    public  ITeacherDao getProxyInstance(){
        //参数1:类加载器
        //参数2：类实现的所有接口
        //参数3：执行目标方法时，会触发的实践处理器方法（可以这里增强原对象的方法）
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //method是通过反射拿来的方法
                //args是方法里的参数
                System.out.println("JDK动态代理模式启动...");
                //返回方法调用的结果
                return method.invoke(target,args);
            }
        });
        return (ITeacherDao) o;
    }
}
