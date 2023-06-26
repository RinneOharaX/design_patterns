package com.itheima.pattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:40
 */
public class InfoCollege implements College{
    private List<Department> departmentList=new ArrayList<>();

    private int index=0;


    @Override
    public String getName() {
        return "Info_College";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department=new Department(name,des);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
