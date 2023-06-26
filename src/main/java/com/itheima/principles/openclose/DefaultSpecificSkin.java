package com.itheima.principles.openclose;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 16:08
 */
public class DefaultSpecificSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
