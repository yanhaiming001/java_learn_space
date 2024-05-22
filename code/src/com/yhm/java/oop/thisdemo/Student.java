package com.yhm.java.oop.thisdemo;

public class Student {
    //定义学生的分数
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        //this解决方法中变量名称冲突问题，例如方法中的参数score和成员变量score冲突

        if (this.score > score) {
            System.out.println("成功通过录取分数线");
        }
    }

}
