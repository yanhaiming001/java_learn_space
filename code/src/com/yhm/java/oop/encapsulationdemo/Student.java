package com.yhm.java.oop.encapsulationdemo;

public class Student {
    private double score;


    /**
     * 设置成员变量的值，在方法内部可以添加一些约束
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;

    }

    public double getScore() {
        return this.score;
    }

}
