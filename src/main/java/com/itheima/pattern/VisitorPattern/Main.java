package com.itheima.pattern.VisitorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:16
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.attach(new Man("xbw",new Success()));
        objectStructure.attach(new Women("zxy",new Fail()));
        objectStructure.display();
    }
}
