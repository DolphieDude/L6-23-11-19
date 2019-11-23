package com.cherevatyi;


public class User {
    private String name;
    private int age;
    public User() { }
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return this.name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
