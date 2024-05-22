package com.yhm.java.oop.javabean;


public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("yhm");
        student.setScore(99);

        StudentOperater stuo = new StudentOperater(student);
        stuo.printPass();


    }
}
