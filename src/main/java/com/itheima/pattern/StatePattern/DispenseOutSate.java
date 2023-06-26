package com.itheima.pattern.StatePattern;

import lombok.AllArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 16:47
 */
@AllArgsConstructor
public class DispenseOutSate implements State{
    Activity activity;
    @Override
    public void deduceMoney() {
        System.out.println("奖品已经发送完毕，请下次再参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经发送完毕，请下次再参与");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已经发送完毕，请下次再参与");
    }
}
