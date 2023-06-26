package com.itheima.pattern.StrategyPattern;

import lombok.AllArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 17:31
 */
@AllArgsConstructor
public class Context {
    private Strategy myStrategy;

    public void show(Strategy myStrategy){
        myStrategy.show();
    }
}
