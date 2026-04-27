package StackQueue;

public class UC1_StackCreate {
    public static void execute() {

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display(); // 56->30->70
    }
}
