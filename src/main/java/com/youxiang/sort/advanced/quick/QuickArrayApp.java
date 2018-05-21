package com.youxiang.sort.advanced.quick;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class QuickArrayApp {

    public static void main(String[] args) {
        int size = 15;
        QuickArray qa = new QuickArray(size);

        for (int i = 0; i < size; i++) {
            qa.insert((long) (Math.random() * 199));
        }
        qa.dispaly();

        qa.quickSort();
        qa.dispaly();
    }
}
