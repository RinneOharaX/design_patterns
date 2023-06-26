package com.itheima.pattern.BuilderType.After;

import com.itheima.pattern.BuilderType.After.AbstractHouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:32
 */

@AllArgsConstructor
@Data
@NoArgsConstructor
//这个类去提取抽象层，传入抽象层的对象，进行方法顺序的调用委派。
//通过这样的方法，我们就可以通过这个类的抽象层来传入不同的实例对象，完成不同类型对象委派同意流程的效果
//区别于抽象工厂类就在于，抽象工厂类更注重的是匹配不同的流程来完成类的创建，而建造者模式更注重与流程的创建
public class HouseDirecotr {

    private AbstractHouse abstractHouse;
    //写一个方法指定传入的房子类型，来建造房子
    public House getHouse(){
        abstractHouse.buildBasic();
        abstractHouse.buildWall();
        abstractHouse.buildRoofed();
        return abstractHouse.build();
    }
}
