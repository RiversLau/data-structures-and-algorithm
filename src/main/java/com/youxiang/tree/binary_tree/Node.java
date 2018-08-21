package com.youxiang.tree.binary_tree;

/**
 * @author: Rivers
 * @date: 2018/8/20
 */
public class Node {

    int iData;
    Double dData;
    Node leftChild;
    Node rightChild;

    public void displayNode() {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(",");
        System.out.print(dData);
        System.out.print("}");
    }
}
