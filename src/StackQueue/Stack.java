package StackQueue;
import java.util.*;
public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    // push → use add (insert at head)
    public void push(T data) {
        list.add(data);
    }

    // pop → remove head
    public void pop() {
        list.pop();
    }

    // peek → return head
    public T peek() {
        if (list.head == null) return null;
        return list.head.data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public int size() {
        return list.size();
    }

    public void display() {
        list.display();
    }
}
