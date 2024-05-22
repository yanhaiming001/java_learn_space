package com.yhm.java.oop.constructor;

/**
 * 构造器
 * 1、创建对象的时候，对象会调用构造器
 * 构造器应用场景：
 * 1）创建对象时，同时完成成员变量的初始化工作
 * 2）创建对象的时候，我们可以指定去调用哪个构造器执行；
 *
 * 注意事项：
 * 1）类在设计时候，无构造器，java会默认生成一个无参构造器；
 * 2）
 *
 */
public class Student {
    String name;
    double score;

    public Student() {
        System.out.println("无参数构造器被执行");
    }

    public Student(String name, double score) {
        System.out.println("有参数参数构造器被执行");
        this.name=name;
        this.score=score;
    }


}
