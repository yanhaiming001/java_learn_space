package com.yhm.java.oop.javabean;

public class Student {
    //1 必须私有化成员变量，为每个成员变量提供get和set方法
    //2 为类提供一个无参构造方法

    //实体类 只存储数据
    //对数据处理交给其他类，实现数据和业务分离

    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
