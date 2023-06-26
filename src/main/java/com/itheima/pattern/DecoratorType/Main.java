package com.itheima.pattern.DecoratorType;

import com.itheima.pattern.DecoratorType.Coffe.Drink;
import com.itheima.pattern.DecoratorType.Coffe.ShortBlack;
import com.itheima.pattern.DecoratorType.Decorator.Chocolate;
import com.itheima.pattern.DecoratorType.Decorator.Decorator;
import com.itheima.pattern.DecoratorType.Decorator.Milk;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:25
 */

//通过Drink抽象类new出想要的咖啡对象，
public class Main {
    public static void main(String[] args) {
        Drink shortBlack=new ShortBlack();
        Decorator order=new Milk(shortBlack);
        System.out.println(order.cost());
        Decorator order2=new Milk(order);
        System.out.println(order2.cost());
    }
}
