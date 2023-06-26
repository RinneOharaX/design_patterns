package com.itheima.pattern.InterpreterPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 15:54
 */
public class MinusExpression extends  AbstractExpreesion{
    @Override
    public void Interpret(Context context) {
        int sum = context.doSum();
        sum--;
        context.setSum(sum);
    }
}
