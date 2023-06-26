package com.itheima.pattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 15:25
 */
public class ObjectStructure {
    private List<Person> person=new ArrayList<>();

    public void  attach(Person p){
        person.add(p);
    }

    public void detach(Person p){
        person.remove(p);
    }

    public  void display(){
        for (Person p:person){
            p.accept(p.getAciton());
        }
    }


}
