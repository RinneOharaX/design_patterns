package com.itheima.pattern.ProxyType.StaticProxy;

//由于代理对象和被代理对象都要实现这个接口，所以一旦接口的发送改变，需要同时更新代理对象和被代理对象就显得比较冗余
public interface ITeacherDao {
    public void teach();
}
