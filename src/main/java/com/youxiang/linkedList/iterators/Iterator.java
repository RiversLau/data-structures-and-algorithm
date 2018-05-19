package com.youxiang.linkedList.iterators;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class Iterator {

    private Link current;
    private Link previous;
    private LinkList linkList;

    public Iterator(LinkList linkList) {
        this.linkList = linkList;
        reset();
    }

    public void reset() {
        current = linkList.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return current.next == null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(long value) {
        Link link = new Link(value);
        if (linkList.isEmpty()) {
            linkList.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(long value) {
        Link temp = new Link(value);
        if (previous == null) {
            temp.next = linkList.getFirst();
            linkList.setFirst(temp);
            reset();
        } else {
            temp.next = previous.next;
            previous.next = temp;
            current = temp;
        }
    }

    public long deleteCurrent() {
        long value = current.data;
        if (previous == null) {
            linkList.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
