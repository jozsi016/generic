package org.jnagy.bounds;

public class LinkedList<T> {
    Node<T> head;
    int size;

    class Node<T> {
        T type;
        Node next;

        Node(T type) {
            this.type = type;
            this.next = null;
        }
    }

    public LinkedList<T> insert(LinkedList<T> list, T type) {
        Node<T> newNode = new Node(type);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
            size = 1;
        } else {
            Node<T> last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            size++;
            last.next = newNode;
        }
        return list;
    }

    public LinkedList<T> deleteFirst(LinkedList<T> list) {
        Node<T> currNode = list.head;

        if (currNode != null) {
            list.head = currNode.next;
            size--;
        }
        return list;
    }

    public T get(LinkedList<T> list, T type) {
        Node<T> currNode = list.head;
        if (currNode == null) {
            return null;
        }
        while (currNode != null && !currNode.type.equals(type)) {
            currNode = currNode.next;
        }
        return currNode.type;
    }

    public LinkedList<T> deleteLast(LinkedList<T> list) {
        Node<T> currNode = list.head, prev = null;
        if (currNode == null || currNode.next == null) {
            list.head = null;
            size--;
            return list;
        }
        while (currNode != null) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            prev.next = null;
        }
        size--;
        return list;
    }

    public LinkedList<T> deleteByKey(LinkedList<T> list, T key) {
        Node<T> currNode = list.head, prev = null;

        if (currNode != null && currNode.type.equals(key)) {
            list.head = currNode.next;
            size--;
            return list;
        }

        // If the key is somewhere other than at head
        while (currNode != null && !currNode.type.equals(key)) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            size--;
        }
        return list;
    }

    public int size() {
        return size;
    }
}
