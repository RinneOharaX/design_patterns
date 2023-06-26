package com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.after;

import com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.before.CheesePizza;
import com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.before.GreekPizza;
import com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.before.Pizza;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 13:50
 */

/*将创建披萨对象的过程交付于工厂类而不是直接在订单类写死，这样如果需要新增披萨的种类，只需要增加一个披萨的实现类，再在工厂类内进行修改即可。
  而不需要到每个点单类里面去修改，省去了许多不必要的代码
 */
public class PizzaFactory {
    com.itheima.pattern.ProtoTyple.FactoryType.SimpleFactory.before.Pizza pizza=null;
    public Pizza getOrderPizza(String orderType){
        if (orderType.equals("GreekPizza")){
            pizza=new GreekPizza();
        }else if (orderType.equals("CheesePizza")){
            pizza=new CheesePizza();
            }else {
            System.out.println("输入的种类有误");
        }
        return pizza;
        }
}
