package com.itheima.pattern.FlyweightPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 14:30
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
//定义一个享元模式的外部状态，表示是谁在使用这个实例
public class User {
    private String username;
}
