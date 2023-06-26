package com.itheima.pattern.CompositePattern;

import com.itheima.pattern.DecoratorType.Decorator.Decorator;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/19 17:33
 */
public class Main {
    public static void main(String[] args) {
        OrganizationComponent university=new University("清华","清华大学");
        OrganizationComponent college=new College("计算机学院" ,"计算机学院");
        OrganizationComponent college1=new College("美院","美院");
        university.add(college);
        university.add(college1);
        OrganizationComponent department=new Department("软工","软工");
        OrganizationComponent department1=new Department("设计","设计");
        college1.add(department1);
        college.add(department);
        university.print();
    }
}
