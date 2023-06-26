package com.itheima.pattern.IteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:48
 */
public class OutPutImp {
    public OutPutImp(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    List<College> collegeList;

    public void soutAll(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            Iterator Collegeiterator = college.createIterator();
            System.out.println(college.getName());
            while (Collegeiterator.hasNext()){
                System.out.println(Collegeiterator.next());
            }
        }
    }
}
