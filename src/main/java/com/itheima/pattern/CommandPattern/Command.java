package com.itheima.pattern.CommandPattern;

//定义一个命令接口，有操作的执行和撤销方法，供子类去具体实现
public interface Command  {
    void operate();

    void undo();
}
