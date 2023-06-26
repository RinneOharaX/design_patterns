package com.itheima.pattern.IteratorPattern;

import java.util.Iterator;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:30
 */
public class ComputerCollege implements College{


    private Department[] departments;
    int num=0;
    public ComputerCollege() {
        departments=new Department[5];
    }
    @Override
    public String getName() {
        return "Computer_College";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department=new Department(name,des);
        if (departments[num]==null){
            departments[num]=department;
            num++;
        }if (num==6){
            throw new RuntimeException("不能存储过多专业");
        }
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
