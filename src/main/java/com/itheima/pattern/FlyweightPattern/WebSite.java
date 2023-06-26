package com.itheima.pattern.FlyweightPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 13:59
 */
//给网站定义一个抽象类，让不同的发布形式可以有不同的扩展定义
public abstract class WebSite {
    public abstract void use(User user);
}
