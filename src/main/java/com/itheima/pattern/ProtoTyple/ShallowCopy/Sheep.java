package com.itheima.pattern.ProtoTyple.ShallowCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 12:53
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
//实现cloneable接口，代表该类可以使用Object中的clone方法进行拷贝
public class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String color;

    //重写clone方法，返回一个sheep对象
    @Override
    public Object clone(){
        Sheep sheep=null;
        try{
             sheep = (Sheep)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  sheep;
    }
}
