package com.itheima.pattern.BridgeType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 14:59
 */

//种类类里面可以重写Phone的方法，达到扩展的效果
public class FoldingPhone extends Phone{
    @Override
    public void call(Bridge bridge){
        System.out.println("折叠式");
        bridge.call();
    }
}
