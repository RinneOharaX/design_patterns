package com.itheima.pattern.Factory.AbstractFactory;

import lombok.Data;
import lombok.ToString;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:08
 */
@Data
@ToString
public abstract class Pizza {
    private String pizzaName;

//    因为不同披萨需要准备的原材料不同，因此prepare方法需要是一个抽象的方法，供子类的去重写
    public abstract void prepare();

    public void bake(){
        System.out.println(pizzaName+"正在烘焙...");
    }
    public void cut(){
        System.out.println(pizzaName+"正在切割...");
    }
    public void  box(){
        System.out.println(pizzaName+"正在打包...");
    }
}

