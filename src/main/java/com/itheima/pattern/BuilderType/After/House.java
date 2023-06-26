package com.itheima.pattern.BuilderType.After;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 16:16
 */
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
//建立一个基础的house类，抽象类中创建这个基础类，方便其子类继承这些属性，并且赋值
public class House {
    private Integer base;
    private Integer wall;
    private  Integer roofed;
}
