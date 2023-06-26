package com.itheima.pattern.IteratorPattern;

import com.itheima.principles.isolation.before.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/25 12:53
 */
public class Main {
    public static void main(String[] args) {
        List<College> collegeList=new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.addDepartment("计网","计算机网络");
        computerCollege.addDepartment("数据结构与算法","数据结构与算法");
        computerCollege.addDepartment("数据结构与算法","数据结构与算法");
        computerCollege.addDepartment("数据结构与算法","数据结构与算法");
        computerCollege.addDepartment("数据结构与算法","数据结构与算法");

        collegeList.add(computerCollege);
        InfoCollege infoCollege = new InfoCollege();
        infoCollege.addDepartment("信息安全","信息安全");
        infoCollege.addDepartment("信息管理","信息管理");
        collegeList.add(infoCollege);
        OutPutImp outPutImp=new OutPutImp(collegeList);
        outPutImp.soutAll();
    }
}
