package com.itheima.pattern.StatePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 16:48
 */
@Data
@NoArgsConstructor
public class Activity {
    State state=null;
    //奖品数量
    int count=0;

    State canRaffleState=new CanRaffleState(this);
    State dispenseOutState=new DispenseOutSate(this);
    State dispenseState=new DispenseState(this);
    State noRaffleState=new NoRaffleState(this);


    public Activity(int count) {
        //构造器中初始化状态
        this.state=getNoRaffleState();
        this.count = count;
    }

    public void debuctMoney(){
        state.deduceMoney();
    }

    public void raffle(){
        state.raffle();
    }}

