package com.company.Task17;


public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
