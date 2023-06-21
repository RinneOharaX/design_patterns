package com.itheima.pattern.Singleton;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 15:52
 */

//双重检查锁单例模式
public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}

    private static volatile DoubleCheckSingleton doubleCheckSingleton=null;

    public static DoubleCheckSingleton getDoubleCheckSingleton(){
        /*不加锁直接进来判断，如果是读操作的话就可以直接返回了，如果为空会产生写操作，再进行加锁判断
        * 双重检查锁既满足了多线程情况下的单例，也提升了许多效率，但也存在问题
        * 那就是双重检查锁模式在多线程环境下，可能会出现空指针异常，出现空指针的原因是因为JVM在对字节码指令优化排序时出现的问题
        * 要解决空指针问题，需要使用关键字volatile，volatile关键字是用来保证有序性
        * volatile 关键字需要放在变量上面
        * 在使用了volatile关键词解决问题之后，双重检查锁就已经是一个比较好的单例模式体现。
        * */

        if (doubleCheckSingleton==null){
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
