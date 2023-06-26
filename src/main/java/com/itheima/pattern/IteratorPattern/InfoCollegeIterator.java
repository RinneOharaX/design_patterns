package com.itheima.pattern.IteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:23
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departmentList;
    private int index=-1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
       if (index>=departmentList.size()-1){
           return false;
       }else {
           index++;
           return true;
       }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
