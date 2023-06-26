package com.itheima.pattern.StatePattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:14
 */
public class Main {
    public static void main(String[] args) {
        Activity activity=new Activity(10);

        for (int i = 1; i <= 100; i++) {
            System.out.println("第"+i+"次抽奖...");
            activity.debuctMoney();
            activity.raffle();
        }
    }
}
