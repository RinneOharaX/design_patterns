package com.itheima.pattern.TemplatePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 10:48
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SoybeanMilk extends  Template{
    private String type;
    @Override
    public void select() {
        System.out.println("挑选的豆浆种类为"+type);
    }
    @Override
    boolean hookmethod(){
        return false;
    }
}
