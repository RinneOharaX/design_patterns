package com.itheima.pattern.CompositePattern;

import com.itheima.pattern.BridgeType.TestSingleton.ListNode;
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

@AllArgsConstructor
@NoArgsConstructor
@Data
//应该是一个抽象的方法，便于子类去扩展其中的内容
public abstract class OrganizationComponent {
    private String name;
    private String describe;



    public void add(OrganizationComponent orgs){
       throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent orgs){
        throw new UnsupportedOperationException();
    }
    public abstract void print();
}
