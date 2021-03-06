package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class ClassDataArray {

    private Person[] arr;
    private int nElems;

    public ClassDataArray(int max) {
        arr = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j].getLastName().equalsIgnoreCase(searchName)) {
                break;
            }
        }
        if (j == nElems) {
            return null;
        } else {
            return arr[j];
        }
    }

    public void insert(String last, String first, int age) {
        arr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j].getLastName().equalsIgnoreCase(searchName)) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            arr[j].display();
        }
    }
}
