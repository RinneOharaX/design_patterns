package com.itheima.pattern.ProtoTyple.FactoryType.AbstractFactory;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/14 15:55
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore();
        pizzaStore.order(new BJPizzaFactory());
    }
}
