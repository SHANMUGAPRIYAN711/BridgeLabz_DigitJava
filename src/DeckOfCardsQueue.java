class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}

class Queue {
    Node front, rear;

    void enqueue(String data) {
        Node n = new Node(data);
        if (rear == null)
            front = rear = n;
        else {
            rear.next = n;
            rear = n;
        }
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class DeckOfCardsQueue {
    public static void main(String[] args) {

        String[] cards = {"A","2","3","4","5","6","7","8","9"};

        Queue q = new Queue();

        for (String c : cards)
            q.enqueue(c);

        q.display();
    }
}