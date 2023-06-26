package com.itheima.pattern.StatePattern;

import lombok.AllArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 16:46
 */
@AllArgsConstructor
public class NoRaffleState implements State{
    Activity activity;

    @Override
    public void deduceMoney() {
        System.out.println("扣除积分成功，可以进行抽奖");
        activity.setState(activity.getState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后，才能抽奖");
        activity.setState(activity.getCanRaffleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
