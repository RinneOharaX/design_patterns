package com.itheima.pattern.InterpreterPattern;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 15:52
 */
public class PlusExpression extends  AbstractExpreesion{
    @Override
    public void Interpret(Context context) {
        int i = context.doSum();
        i++;
        context.setSum(i);
    }
}
