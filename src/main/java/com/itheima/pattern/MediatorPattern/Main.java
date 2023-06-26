package com.itheima.pattern.MediatorPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 17:04
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Colleague alarm=new Alarm(mediator,"alarm");
        Colleague tv=new Tv(mediator,"tv");
        Colleague coffeeMachine=new CoffeeMachine(mediator,"coffeeMachine");
        mediator.getMessage(1,"alarm");
        mediator.getMessage(0,"tv");
        mediator.getMessage(1,"coffeeMachine");
        mediator.sendMessage();
    }
}
