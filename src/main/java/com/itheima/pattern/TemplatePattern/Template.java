package com.itheima.pattern.TemplatePattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 10:49
 */
public abstract class Template {
    public void template(){
        if (hookmethod()) {
            select();
        }
        soak();
        crush();
    }
    //因为不同豆浆的制作过程，只有选材这步是不同的，所以定义为抽象方法供子类去实现
    public abstract void  select();

    public void soak(){
        System.out.println("完成浸泡过程");
    }

    public void crush(){
        System.out.println("完成压碎过程");
    }

    //可以提供一个钩子方法，子类可以看具体情况要不要实现
    boolean hookmethod(){
        return true;
    }
}
