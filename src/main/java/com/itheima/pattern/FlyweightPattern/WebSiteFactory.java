package com.itheima.pattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 14:06
 */
public class WebSiteFactory {
    Map<String,WebSite> pool=new HashMap<>();
    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ContreteWebSite(type));
        }
            return (WebSite) pool.get(type);
    }
    public int getWebSiteCount(){
        return pool.size();
    }
}
