package com.itheima.principles.lawofdimeter;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/21 14:27
 */
public class Agent {
    private  String name;
    private Fans fans;
    private Star star;

    public Agent(String name, Fans fans, Star star) {
        this.name = name;
        this.fans = fans;
        this.star = star;
    }

    public Agent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }
}
