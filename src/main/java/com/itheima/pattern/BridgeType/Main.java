package com.itheima.pattern.BridgeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 15:04
 */
public class Main {
    public static void main(String[] args) {
        Phone foldingPhone=new FoldingPhone();

        foldingPhone.call(new HuaWei());
    }
}
