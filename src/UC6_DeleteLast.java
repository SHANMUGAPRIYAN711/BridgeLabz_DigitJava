public class UC6_DeleteLast {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        list.popLast();

        list.display();
    }
}