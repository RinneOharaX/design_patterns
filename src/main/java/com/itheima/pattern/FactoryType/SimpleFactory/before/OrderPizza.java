package com.itheima.pattern.Factory.SimpleFactory.before;

import java.util.Scanner;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:24
 */
public class OrderPizza {




    public void OrderPizza(){
        while (true){
            System.out.println("输入想要的披萨种类");
            Scanner sc=new Scanner(System.in);
            String orderType= sc.nextLine();
            if (orderType.equals("GreekPizza")){
                Pizza greekPizza=new GreekPizza();
                greekPizza.prepare();
                greekPizza.bake();
                greekPizza.cut();
                greekPizza.box();
            } else if (orderType.equals("CheesePizza")) {
                Pizza cheesePizza = new CheesePizza();
                cheesePizza.prepare();
                cheesePizza.bake();
                cheesePizza.cut();
                cheesePizza.box();
            }else {
                System.out.println("输入的种类有误");
                break;
            }
        }
    }
}
