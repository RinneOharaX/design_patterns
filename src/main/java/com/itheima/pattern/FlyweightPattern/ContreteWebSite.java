package com.itheima.pattern.FlyweightPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 14:00
 */
//网站的具体实现类
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @EqualsAndHashCode(callSuper = true)
public class ContreteWebSite extends WebSite{

    //type是可能是一个实例在池中共享的，因此属于内部状态
    private String type;


    //我们还需要定义一个外部状态，比如是谁在使用网站


    @Override
    public void use(User user) {
        System.out.println(user.getUsername()+"网站的发布形式为"+type);
    }
}
