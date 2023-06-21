package com.itheima.principles.demo01;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 16:10
 */
public class SougouInput {
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    private AbstractSkin skin;

    public void  display(){
        skin.display();
    }
}
