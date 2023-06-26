package com.itheima.pattern.ProtoTyple.DeepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/15 14:01
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Cat implements Cloneable, Serializable {
    private  String  name;
    private  Integer age;
    private  String  color;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
