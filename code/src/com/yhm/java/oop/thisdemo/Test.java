package com.yhm.java.oop.thisdemo;

public class Test {
    public static void main(String[] args) {
        //本节目标 理解this
        /**
         * this 是一个变量，在方法中使用，指向当前类的对象
         * this的应用场景：
         * 1、
         */
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        System.out.println("===========================================");

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();

        System.out.println("===========================================");
        Student s3 = new Student();
        s3.score=350;
        s3.printPass(250);
    }
}
