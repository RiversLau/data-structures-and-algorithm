package com.youxiang.hash.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/9/2
 */
public class HashTableApp {

    public static void main(String[] args) throws IOException {

        DataItem dataItem;
        int aKey, size, n, keysPerCell;

        System.out.print("Enter size of hash table: ");
        size = getInt();

        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);
        for (int j = 0; j < n; j++) {
            aKey = (int) (Math.random() * keysPerCell * size);
            dataItem = new DataItem(aKey);
            theHashTable.insert(dataItem);
        }

        while (true) {
            System.out.print("Enter first letter of show, insert, delete, find or quit: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.display();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    dataItem = new DataItem(aKey);
                    theHashTable.insert(dataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    dataItem = theHashTable.find(aKey);
                    if (dataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                case 'q':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry\n");
            }
        }
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        String s = reader.readLine();
        return s;
    }
}
