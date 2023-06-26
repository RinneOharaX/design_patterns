package com.itheima.pattern.StatePattern;

import lombok.AllArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 16:47
 */
@AllArgsConstructor
public class DispenseState implements State{
    Activity activity;
    @Override
    public void deduceMoney() {
        System.out.println("已经中奖，无法扣取积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("已经中奖，无法抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount()>0){
            System.out.println("奖品发放...");
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("奖品已经发放完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
