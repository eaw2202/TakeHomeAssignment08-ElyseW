package com.elysewarren.takehomeassignment08_elysew;

/**
 * Created by elysewarren on 5/11/17.
 */

public class Student {
    public String studentName;
    public int age;
    public boolean myStudent;

    public Student() {
    }

    public Student(String studentName, int age, boolean isMyStudent) {
        this.studentName = studentName;
        this.age = age;
        this.myStudent = isMyStudent();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMyStudent() {
        return isMyStudent();
    }

}