package com.itheima.pattern.ProtoTyple.ShallowCopy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 13:00
 */
public class Main {
    //通过这样的方式进行重复对象的创建，好处在于，如果我需要修改其中的属性，或者添加删除属性，只需要修改原型羊就可以，而不用全部的羊都修改
    public static void main(String[] args) {
        Sheep sheep=new Sheep("多利",1,"White");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();




    }
}
