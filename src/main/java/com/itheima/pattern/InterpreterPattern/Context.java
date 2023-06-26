package com.itheima.pattern.InterpreterPattern;

import lombok.Data;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 15:44
 */
@Data
public class Context {
    private int sum;

    public int doSum(){
        int sum1 = getSum();
        setSum(sum);
        return sum1;
    }



}
