package com.youxiang.sort.simple;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class ObjectInsertionArrayApp {

    public static void main(String[] args) {
        
        ObjectInsertionArray arr = new ObjectInsertionArray(10);
        arr.insert("Curry", "Stephen", 31);
        arr.insert("Toddmpson", "Clay", 28);
        arr.insert("Durant", "Keiven", 32);
        arr.insert("Bryant", "Kobe", 38);
        arr.insert("Iverson", "Allen", 42);
        arr.insert("Cater", "Vence", 40);
        arr.insert("McGrady", "Tim", 43);
        arr.insert("Duncun", "Tim", 45);
        arr.insert("Garnet", "Keven", 43);
        arr.insert("Jordan", "Michael", 50);

        arr.display();
        System.out.println("+++++++++++++++++++++++++++");
        arr.sort();
        arr.display();
    }
}
