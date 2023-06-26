package com.itheima.pattern.CompositePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/19 17:13
 */

@NoArgsConstructor
public class Department extends  OrganizationComponent{


    @Override
    public void print() {
        System.out.println(getName());
    }

    public Department(String name, String describe) {
        super(name, describe);
    }
}
