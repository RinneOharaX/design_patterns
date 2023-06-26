package com.itheima.pattern.StatePattern;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 16:47
 */

@AllArgsConstructor
public class CanRaffleState implements  State{
    Activity activity;
    @Override
    public void deduceMoney() {
        System.out.println("已经扣过积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖请稍等...");
        Random r = new Random();
        int i = r.nextInt(10);
        if (i==0){
            System.out.println("恭喜中奖");
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾没有中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，无法发放奖品");
    }
}
