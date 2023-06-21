package com.itheima.pattern.Factory.AbstractFactory;

import java.util.Scanner;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 15:11
 */
public class PizzaStore {
    PizzaFactroy pizzaFactroy;
    public void order(PizzaFactroy pizzaFactroy) {
        while (true){
            String orderType=new Scanner(System.in).nextLine();
            Pizza pizza = pizzaFactroy.getPizzaFactory(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();;
                pizza.box();
            }else{
                throw new RuntimeException("种类不存在");
            }
        }
    }
}
