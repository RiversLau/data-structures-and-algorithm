package com.youxiang.sort.advanced.partition;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class PartitionArrayApp {

    public static void main(String[] args) {

        int size = 16;
        PartitionArray pa = new PartitionArray(16);

        for (int i = 0; i < size; i++) {
            pa.insert((long) (Math.random() * 199));
        }

        pa.display();

        int index = pa.partition(99);
        System.out.println("Partition Index is " + index);
        pa.display();
    }
}
