package com.itheima.pattern.CommandPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 13:13
 */
//没有任何命令，空执行，初始化每个按钮
public class NoCommand implements Command{
    @Override
    public void operate() {

    }

    @Override
    public void undo() {

    }
}
