package com.itheima.pattern.BridgeType.TestSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/23 16:49
 */
public class Breaking {
    public static void OutBreakingSingleton(DoubleCheckingSingleton doubleCheckingSingleton){
        try (ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\a.txt"))){
            oss.writeObject(doubleCheckingSingleton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void InBreakingSingleton(){
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\a.txt"))){
            DoubleCheckingSingleton instance1 =(DoubleCheckingSingleton) ois.readObject();
            System.out.println(instance1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void BreakingSingletonByReflection(){
        try {
            Class<DoubleCheckingSingleton> clazz = (Class<DoubleCheckingSingleton>) Class.forName("com.itheima.pattern.BridgeType.TestSingleton.DoubleCheckingSingleton");
            Constructor<DoubleCheckingSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            DoubleCheckingSingleton doubleCheckingSingleton1 = constructor.newInstance();
            DoubleCheckingSingleton doubleCheckingSingleton2 = constructor.newInstance();
            System.out.println(doubleCheckingSingleton1.equals(doubleCheckingSingleton2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
