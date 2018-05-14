package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class ClassDataArrayApp {

    public static void main(String[] args) {

        ClassDataArray cda = new ClassDataArray(100);

        cda.insert("Curry", "Stephen", 31);
        cda.insert("Tompson", "Clay", 28);
        cda.insert("Durant", "Keiven", 32);
        cda.insert("Bryant", "Kobe", 38);
        cda.insert("Iverson", "Allen", 42);
        cda.insert("Cater", "Vence", 40);
        cda.insert("McGrady", "Tim", 43);
        cda.insert("Duncun", "Tim", 45);
        cda.insert("Garnet", "Keven", 43);
        cda.insert("Jordan", "Michael", 50);

        cda.display();

        String search = "Bryant";
        Person found = cda.find(search);
        if (found != null) {
            System.out.println("Found " + search);
            found.display();
        } else {
            System.out.println("Cann't Find " + search);
        }

        cda.delete("Duncun");

        cda.display();
    }
}
