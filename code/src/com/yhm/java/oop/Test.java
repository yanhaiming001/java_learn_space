package com.yhm.java.oop;

public class Test {
    public static void main(String[] args) {
        /**
         * 认识面向对象的编程套路
         * 如何处理数据并解决实际问题
         */
        Student student = new Student();
        student.name = "yhm";
        student.math = 88;
        student.chinese = 89;
        student.printAverageScore();
        student.printTotleScore();

        //创建对象s2
        Student s2 = new Student();
        student.name = "YZY";
        student.math = 98;
        student.chinese = 112;
        student.printAverageScore();
        student.printTotleScore();
    }
}
