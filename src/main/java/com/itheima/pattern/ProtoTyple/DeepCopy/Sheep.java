package com.itheima.pattern.ProtoTyple.DeepCopy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 12:53
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
//此时这里的原型类中有其他引用类型对象，如果拷贝这个原型类需要不同的引用类型对象则需要进行深拷贝
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String color;
    private Cat cat;


    //重写clone方法，返回一个sheep对象
    @Override
    public Object clone(){
        Sheep sheep=null;
        try{
            //将基本数据类型进行拷贝
             sheep = (Sheep)super.clone();
             //将它的引用类型属性进行拷贝
            Cat cat = (Cat)sheep.getCat().clone();
            //拷贝出来的不同对象再存回原型对象
            sheep.setCat(cat);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheep;
    }
    //可以利用序列化重新分配内存破坏单例的特性，用来将原型模式的浅拷贝无法复制多个不同对象的问题解决，从而完成通过序列化进行深拷贝。
    //同样的，反射可以通过破坏私有构造器的方式来创建复数个不同对象，也可以用来实现深拷贝，只不过原理与序列化有所不同。
    public Object Serialize(){
        Sheep sheep=null;
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test.txt"));
            ObjectInputStream is=new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.txt")))
        {
            outputStream.writeObject(this);
            sheep =(Sheep) is.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sheep;
    }
}
