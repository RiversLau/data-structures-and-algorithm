package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class Person {

    private String lastName;
    private String firstName;

    private int age;

    public Person(String lastName, String firstName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void display() {
        System.out.println("LastName:" + lastName + ", FirstName:" + firstName + ", Age:" + age);
    }

    public String getLastName() {
        return lastName;
    }
}
