package com.itheima.pattern.Singleton;

import java.io.Serializable;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 16:10
 */

/*静态内部类的方式去创建懒汉式单例，用到的方法就是，一个外部类被创建的时候，其内部类是不会被加载的。要直到内部类被调用才会被加载，符合懒汉式的思想。
* 静态内部类是一种优秀的单例模式，是开源项目中比较常用的，在没有加任何锁的情况下，保证了线程的安全，没有空间的浪费和影响性能*/
public class StaticInternalSingleton implements Serializable {
//    private static boolean flag=false;
    private StaticInternalSingleton (){
        //通过这样的方式可以防止通过反射破坏单例模式
        //如果flag为true就代表已经有创建的对象了，因此阻止外界用反射的方式破坏私有构造器从而创造重复对象
//        if (flag){
//            throw new RuntimeException("不能创建重复的对象");
//        }
//        flag=true;
    }

    private static class StaticInternal{
        private static final StaticInternalSingleton INSTANCE=new StaticInternalSingleton();
    }
    //直到使用这个方法的时候，上面的内部类信息才会被加载
    public static StaticInternalSingleton getInstance(){
        return StaticInternal.INSTANCE;
    }
    //如果添加了readResolve方法，那么这个单例模式不会被序列化破坏
//    private Object readResolve(){
//        return StaticInternal.INSTANCE;
//    }

}
