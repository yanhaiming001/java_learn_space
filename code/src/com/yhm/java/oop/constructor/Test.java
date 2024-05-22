package com.yhm.java.oop.constructor;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("==============");
        Student s2 = new Student("严海鸣", 75);

        Teacher teacher = new Teacher();
    }
}
