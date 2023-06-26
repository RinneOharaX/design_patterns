package com.itheima.pattern.MediatorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 16:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract String sendMessage(int stateChange);

}
