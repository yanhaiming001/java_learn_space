package com.yhm.java.oop.javabean;

public class StudentOperater {
    private Student student;

    public StudentOperater(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (this.student.getScore() >= 60) {
            System.out.println("通过！");
        } else {
            System.out.println("未通过");
        }
    }
}
