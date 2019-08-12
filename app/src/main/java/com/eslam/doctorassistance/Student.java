package com.eslam.doctorassistance;

import java.io.Serializable;

public class Student implements Serializable {
   private String name, age, grade, address;

    public Student() {
    }

    public Student(String name, String age, String grade, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
