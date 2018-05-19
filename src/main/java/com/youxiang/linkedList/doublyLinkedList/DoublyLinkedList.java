package com.youxiang.linkedList.doublyLinkedList;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(long value) {
        Link link = new Link(value);
        if (isEmpty()) {
            last = link;
        } else {
            first.left = link;
        }
        link.right = first;
        first = link;
    }

    public void insertLast(long value) {
        Link link = new Link(value);
        if (isEmpty()) {
            first = link;
        } else {
            last.right = link;
            link.left = last;
        }
        last = link;
    }

    public Link deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        Link temp = first;
        if (first.right == null) {
            last = null;
        } else {
            first.right.left = null;
        }
        first = first.right;
        return temp;
    }

    public Link deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Link temp = last;
        if (last.left == null) {
            first = null;
        } else {
            last.left.right = null;
        }
        last = last.left;
        return temp;
    }

    public boolean insertAfter(long key, long value) {
        if (isEmpty()) {
            return false;
        }

        Link current = first;
        // 判断当前节点是否等于要查找的Key
        while (current.data != key) {
            current = current.right;
            // 如果下个节点为null，说明已经全部遍历完，直接返回false
            if (current == null) {
                return false;
            }
        }

        Link temp = new Link(value);
        if (current.right == null) {    // current为最后一个
            current.right = temp;
            temp.left = current;
            last = temp;
        } else {
            current.right.left = temp;
            temp.right = current.right;

            temp.left = current;
            current.right = temp;
        }
        return true;
    }

    public Link deleteKey(long key) {
        if (isEmpty()) {
            return null;
        }
        Link current = first;
        while (current.data != key) {
            current = current.right;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.right;
            current.right.left = null;
        } else if (current == last) {
            last = current.left;
            current.left.right = null;
        } else {
            current.left.right = current.right;
            current.right.left = current.left;
        }
        return current;
    }

    public void forwardShow() {
        System.out.print("List(first-->last):");
        if (isEmpty()) {
            System.out.print("Empty List");
        } else {
            Link current = first;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
        System.out.println();
    }

    public void backwardShow() {
        System.out.print("List(last-->first):");
        if (isEmpty()) {
            System.out.print("Empty List");
        } else {
            Link current = last;
            while (current.left != null) {
                System.out.print(current.data + " ");
                current = current.left;
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return first == null;
    }
}
