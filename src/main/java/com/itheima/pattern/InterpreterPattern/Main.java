package com.itheima.pattern.InterpreterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 15:55
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setSum(10);
        List<AbstractExpreesion> list = new ArrayList<>();
        //运行加法三次
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        //运行减法两次
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        for (int i = 0; i < list.size(); i++)
        {
            AbstractExpreesion expression = list.get(i);
            expression.Interpret(context);
        }
        System.out.println(context.doSum());

        //得出结果为11

    }
}
