package com.itheima.pattern.Factory.SimpleFactory.after;

import com.itheima.pattern.Factory.SimpleFactory.before.Pizza;

import java.util.Scanner;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:24
 */
public class OrderPizza {
    public void order() {
        while (true) {
            System.out.println("输入你想要的披萨种类");
            Scanner sc = new Scanner(System.in);
            String orderType = sc.nextLine();
            PizzaFactory pizzaFactory = new PizzaFactory();
            Pizza orderPizza = pizzaFactory.getOrderPizza(orderType);
            if (orderPizza==null){
                break;
            }else {
                orderPizza.prepare();
                orderPizza.bake();
                orderPizza.cut();
                orderPizza.box();
            }
        }
    }
}
