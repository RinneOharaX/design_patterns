package com.itheima.pattern.BridgeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 14:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Phone {
    private  String name;
    private  String type;
    private  String brand;


    //方法中可以以这个接口传参，就可以拿到对应品牌的功能和属性
    public void call(Bridge bridge){
        bridge.call();
    }
}
