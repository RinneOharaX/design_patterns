package com.itheima.pattern.DecoratorType.Decorator;

import com.itheima.pattern.DecoratorType.Coffe.Drink;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/16 16:21
 */


@AllArgsConstructor
@Data
//类中关联Drink类，调用各种不同的咖啡来计算价钱
public  class Decorator extends Drink {

    //此处drink就是被装饰者
    private Drink drink;

    public int cost(){
        //调料的价格+饮料的价格
      return super.getPrice()+drink.cost();
    };

}
