package com.itheima.pattern.FlyweightPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 14:13
 */
public class Main {
    public static void main(String[] args) {
        //虽说创建了多个news对象，但其实都是从Hashmap里取到的同一个实例，这样就避免了实例的重复创建
        WebSiteFactory webSiteFactory=new WebSiteFactory();
        User aaa=new User("aaa");
        User bbb=new User("bbb");
        WebSite web = webSiteFactory.getWebSite("网页");
        web.use(aaa);
        WebSite news1 = webSiteFactory.getWebSite("news");
        news1.use(aaa);
        WebSite news2 = webSiteFactory.getWebSite("news");
        news2.use(bbb);
        WebSite news3 = webSiteFactory.getWebSite("news");
        news3.use(bbb);
        System.out.println(news1==news2);
    }
}
