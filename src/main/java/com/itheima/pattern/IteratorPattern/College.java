package com.itheima.pattern.IteratorPattern;

import java.util.Iterator;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:28
 */
public interface College {
    public String getName();

    public void addDepartment(String name,String des);

     public Iterator createIterator();


}
