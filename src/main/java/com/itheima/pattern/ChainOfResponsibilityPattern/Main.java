package com.itheima.pattern.ChainOfResponsibilityPattern;

import org.w3c.dom.ls.LSOutput;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:46
 */
public class Main {
    public static void main(String[] args) {
        Support limitSupportLess = new LimitSupport("有限支持小",5);
        Support limitSupportMore = new LimitSupport("有限支持大",15);
        Support oddSupport = new OddSupport("奇数支持");
        Support specialSupport = new SpecialSupport("特定支持",36);
        Support noSupport = new NoSupport("没有支持");
        limitSupportLess.setAndReturnNext(limitSupportMore).setAndReturnNext(oddSupport).setAndReturnNext(specialSupport).setAndReturnNext(noSupport);
        System.out.println("===<有限支持小>尝试解决问题===");

        for(int i=0;i<40;i++){
            limitSupportLess.support(new Trouble(i));
        }
        System.out.println("===<特定支持>尝试解决问题===");
        for(int i=0;i<40;i++){
            specialSupport.support(new Trouble(i));
    }
}
    }
