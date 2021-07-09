package com.example.recycler_view;

public class modelclass {
    private String name;
    private int age;
    private String rollno;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollno() {
        return rollno;
    }

    public modelclass(String name, int age, String rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
}
