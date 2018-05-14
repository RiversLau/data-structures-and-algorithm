package com.youxiang.sort.simple;

import com.youxiang.arrays.Person;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class ObjectInsertionArray {

    private Person[] arr;
    private int nElems;

    public ObjectInsertionArray(int size) {
        arr = new Person[size];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void sort() {
        int inner, outer;
        for (outer = 1; outer < nElems; outer++) {
            Person tmp = arr[outer];
            inner = outer;
            while (inner > 0 &&
                    arr[inner - 1].getLastName().compareTo(tmp.getLastName()) > 0) {
                arr[inner] = arr[inner - 1];
                --inner;
            }
            arr[inner] = tmp;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            arr[j].display();
        }
    }
}
