package com.itheima.pattern.MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/26 13:54
 */
@AllArgsConstructor
@Getter
//备忘录的属性
public class Memento {
    private String state;
}
