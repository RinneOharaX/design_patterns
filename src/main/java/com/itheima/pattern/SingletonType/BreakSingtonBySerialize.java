package com.itheima.pattern.SingletonType;

import java.io.*;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 16:35
 */

/*这个类将演示如何通过序列化的方式去破坏单例模式（枚举类无法被破坏，因为枚举类的单例是通过JVM的底层实现的）
* 从两次读取对象的返回的地址值可以看出，我们的单例模式返回了多个对象，也就是说序列化破坏了单例模式
* 这是因为我们将对象序列化到磁盘中，再从磁盘中反序列化为对象的这个过程中，它的内存会被重新分配*/
public class BreakSingtonBySerialize {
    public static void main(String[] args) {
    writeTotxt();
        readFromtxt();
        readFromtxt();
    }
    //这个方法用来将单例模式的对象写到txt的文件中
    public static void writeTotxt(){
        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test.txt"))){
          oos.writeObject(StaticInternalSingleton.getInstance());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //该方法用来从桌面的test.txt中读取，使用静态内部类创建的对象
    public static void readFromtxt(){
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.txt"))){
            StaticInternalSingleton instance= (StaticInternalSingleton) ois.readObject();
            System.out.println(instance);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
