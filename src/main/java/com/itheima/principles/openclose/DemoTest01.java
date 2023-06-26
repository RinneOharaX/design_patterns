package com.itheima.principles.openclose;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 16:12
 */
public class DemoTest01 {
    public static void main(String[] args) {
        SougouInput sougouInput=new SougouInput();
        AbstractSkin skin=new HeimaSpecificSkin();
        sougouInput.setSkin(skin);
        sougouInput.display();
    }
}
