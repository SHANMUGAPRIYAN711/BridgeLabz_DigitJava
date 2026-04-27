package StackQueue;

public class UC3_QueueCreate {
    public static void execute() {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.display(); // 56->30->70
    }
}
