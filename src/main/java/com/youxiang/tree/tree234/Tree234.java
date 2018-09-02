package com.youxiang.tree.tree234;

/**
 * @author: Rivers
 * @date: 2018/9/1
 */
public class Tree234 {

    private Node root = new Node();

    public int find(long key) {
        Node currentNode=  root;
        int childNumber;
        while (true) {
            if ((childNumber = currentNode.findItem(key)) != -1) {
                return childNumber;
            } else if (currentNode.isLeaf()) {
                return -1;
            } else {
                currentNode = getNextChild(currentNode, key);
            }
        }
    }

    public void insert(long dvalue) {
        Node currentNode = root;
        DataItem tempItem = new DataItem(dvalue);
        while (true) {
            if (currentNode.isFull()) {
                split(currentNode);
                currentNode = currentNode.getParent();
                currentNode = getNextChild(currentNode, dvalue);
            } else if (currentNode.isLeaf()) {
                break;
            } else {
                currentNode = getNextChild(currentNode, dvalue);
            }
        }
        currentNode.insertItem(tempItem);
    }

    public void split(Node thisNode) {
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;

        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);

        Node newRight = new Node();
        if (thisNode == root) {
            root = new Node();
            parent = root;
            root.connectChild(0, thisNode);
        } else {
            parent = thisNode.getParent();
        }

        itemIndex = parent.insertItem(itemB);
        int n = parent.getNumItems();
        for (int j = n - 1; j > itemIndex; j--) {
            Node temp = parent.disconnectChild(j);
            parent.connectChild(j + 1, temp);
        }

        parent.connectChild(itemIndex + 1, newRight);
        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }

    public void displayTree() {
        recDisplayTree(root, 0, 0);
    }

    private void recDisplayTree(Node thisNode, int level, int childNum) {
        System.out.print("Level=" + level + " child=" + childNum + " ");
        thisNode.displayNode();

        int numItems = thisNode.getNumItems();
        for (int j = 0; j < numItems + 1; j++) {
            Node nextNode = thisNode.getChild(j);
            if (nextNode != null) {
                recDisplayTree(nextNode, level + 1, j);
            } else {
                return;
            }
        }
    }

    public Node getNextChild(Node theNode, long key) {
        int j;
        int numItems = theNode.getNumItems();
        for (j = 0; j < numItems; j++) {
            if (key < theNode.getItem(j).dData) {
                return theNode.getChild(j);
            }
        }
        return theNode.getChild(j);
    }
}
