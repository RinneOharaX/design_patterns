package com.itheima.pattern.CompositePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/19 17:12
 */
@NoArgsConstructor
public class College extends  OrganizationComponent{
    private List<OrganizationComponent> organizationComponents=new ArrayList<>();

    @Override
    public void add(OrganizationComponent orgs){
        organizationComponents.add(orgs);
    }

    @Override
    public void remove(OrganizationComponent orgs){
        organizationComponents.remove(orgs);
    }
    @Override
    public void print() {
        System.out.println(getName());
        for (OrganizationComponent orgs:organizationComponents) {
            orgs.print();
        }
    }

    public College(String name, String describe) {
        super(name, describe);
    }
}
