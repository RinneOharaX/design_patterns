package com.itheima.pattern.CompositePattern;

import com.itheima.principles.isolation.before.A;
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
//该类代表的是树的头节
public class University extends OrganizationComponent {
    private List<OrganizationComponent> organizationComponents = new ArrayList<>();

    @Override
    public void add(OrganizationComponent orgs) {
        organizationComponents.add(orgs);
    }

    @Override
    public void remove(OrganizationComponent orgs) {
        organizationComponents.remove(orgs);
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (OrganizationComponent orgs : organizationComponents) {
           orgs.print();
        }
    }

    public University(String name, String describe) {
        super(name, describe);
    }

}
