package com.example.dagger2androiddemo.entity;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class Student
{
    public String name = "小芮";
    public int age = 16;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
