public class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAfter(T prevData, T newData) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(prevData)) {
                Node<T> newNode = new Node<>(newData);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void pop() {
        if (head != null)
            head = head.next;
    }

    public void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public boolean search(T key) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void delete(T key) {
        if (head == null) return;

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
