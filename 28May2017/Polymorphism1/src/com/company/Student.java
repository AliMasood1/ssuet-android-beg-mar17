package com.company;

/**
 * Created by Ishaq Hassan on 5/28/2017.
 */
public class Student extends Human {
    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("Student is studying!");
    }
}
