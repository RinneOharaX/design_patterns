package com.itheima.pattern.StrategyPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:32
 */
public class Main {
    public static void main(String[] args) {
        Context context;

        String time1 = "9月";
        Strategy strategyB = new ConcreteStrategyB();
        context = new Context(strategyB);
        context.show(strategyB);

        String time2 = "11月";
        Strategy strategyC = new ConcreteStrategyC();
        context = new Context(strategyC);
        context.show(strategyC);

        String time3 = "6月";
        Strategy strategyA = new ConcreteStrategyA();
        context = new Context(strategyA);
        context.show(strategyA);
    }
}
