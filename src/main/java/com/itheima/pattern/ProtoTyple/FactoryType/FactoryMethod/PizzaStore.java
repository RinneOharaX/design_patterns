package com.itheima.pattern.ProtoTyple.FactoryType.FactoryMethod;

import java.util.Scanner;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 15:11
 */
public class PizzaStore {
    PizzaFactroy pizzaFactroy=new PizzaFactroy();
    public void order(){
        while(true){
            System.out.println("请输入你想选择的地区");
            String location=new Scanner(System.in).nextLine();
            System.out.println("请输入你想要的披萨种类");
            String ordertype=new Scanner(System.in).nextLine();
            Pizza pizza = pizzaFactroy.getPizzaFactory(location,ordertype);
            if (pizza==null){
                throw new RuntimeException("选择的地区或种类错误");
            }else {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }
    }
}
