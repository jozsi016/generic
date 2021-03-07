package org.jnagy.bounds;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> myStack = new ArrayList();

    public void push(T element) {
        myStack.add(element);
    }

    public T pop() {
        return myStack.remove(myStack.size() - 1);
    }

    public T top() {
        return myStack.get(myStack.size() - 1);
    }

    public void clear() {
        myStack.clear();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }
}
