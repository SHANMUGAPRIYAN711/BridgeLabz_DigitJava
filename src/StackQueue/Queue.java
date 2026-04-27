package StackQueue;
import java.util.*;
public class Queue<T> {

    private LinkedList<T> list = new LinkedList<>();

    // enqueue → add at end
    public void enqueue(T data) {
        list.append(data);
    }

    // dequeue → remove from front
    public void dequeue() {
        list.pop();
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
