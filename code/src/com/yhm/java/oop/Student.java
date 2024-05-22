/**
 * 凡事找对象的编程套路，更加符合人类思维习惯，编程也会更直观。
 *
 * 对象是一种特殊的数据结构
 *
 */
package com.yhm.java.oop;

public class Student {
    //定义类的属性
    String name;
    double chinese;
    double math;
    //定义类的方法
    public void printTotleScore() {
        System.out.println(name + "总成绩是：" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println(name + "平均成绩是：" + (chinese + math) / 2.0);
    }
}
