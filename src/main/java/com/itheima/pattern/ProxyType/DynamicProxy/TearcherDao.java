package com.itheima.pattern.Proxy.DynamicProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/20 16:25
 */

public class TearcherDao implements ITeacherDao{
    @Override
    public void teach(String lesson) {
        System.out.println("上"+lesson+"课...");
    }
}
