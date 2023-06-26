package com.itheima.pattern.ProtoTyple.DeepCopy;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 13:00
 */
public class Main {
    //这样就完成了深拷贝，连同原型sheep里的cat对象也能够创建出不同的了，但问题在于这种重写Clone方法的方式如果引用对象存在多层的嵌套可能重写起来就比较麻烦
    //所有引出了第二种序列化进行深拷贝的方法
    public static void main(String[] args) {

        Sheep sheep=new Sheep("多利",1,"White",new Cat("tom",2,"Black"));
        Sheep serializeSheep =(Sheep) sheep.Serialize();
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println(sheep.getCat()==sheep1.getCat());
        System.out.println(sheep.getCat()==serializeSheep.getCat());

    }
}
