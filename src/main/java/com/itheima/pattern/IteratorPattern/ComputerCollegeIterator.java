package com.itheima.pattern.IteratorPattern;

import java.util.Iterator;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:16
 */
public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    private int location=0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (location>=departments.length||departments[location]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[location++];
    }
}
