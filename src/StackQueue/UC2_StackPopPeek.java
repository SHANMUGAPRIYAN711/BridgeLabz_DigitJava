package StackQueue;

public class UC2_StackPopPeek {
    public static void execute() {

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            stack.pop();
        }
    }
}
