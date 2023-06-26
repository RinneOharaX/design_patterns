package com.itheima.pattern.SingletonType;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 15:29
 */
//懒汉式单例模式，也就是我们常说的懒加载，当类的对象没有创建的时候，是不会去创建单例的，这样比较节约资源
public class LazySingleton {
    //1.创建一个私有的构造器，目的是不想让外界通过构造器创建一个新的对象
    private LazySingleton(){}
    //2.创建一个静态的私有对象，静态是为了保证单例，并赋予null值，因为如果直接new，类加载时候对象就会生成，不符合懒加载的思想。
    private static LazySingleton lazySingleton=null;
    //3.创建一个方法用于创建和返回单例对象。
    public static synchronized LazySingleton getLazySingleton(){
        if (lazySingleton==null){
            /*注意，这里new的过程，如果是多线程情况下，可能会new出不同的对象来，所以多线程下保证单例需要加锁
            * 虽说加上锁能够保证这个单例模式是线程安全的，但其实除了第一次调用方法创建对象的时候，剩下调用该方法基本都是
            * 去读对象返回，没有进行新的new操作（写操作），这本就是线程安全的。我们却一视同仁全部加上了锁，导致了效率十分低下的问题
            * 所以通过加锁懒汉式的弊端，又引申出了另外一种单例模式，双重检查锁模式
            * */
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
