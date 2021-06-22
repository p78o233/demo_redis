package com.example.demoredis.entity;
/*
 * @author p78o2
 * @date 2021/6/21
 */

public class Test {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Test() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
