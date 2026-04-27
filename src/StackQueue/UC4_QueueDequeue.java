package StackQueue;

public class UC4_QueueDequeue {
    public static void execute() {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.dequeue(); // remove 56

        queue.display(); // 30->70
    }
}
