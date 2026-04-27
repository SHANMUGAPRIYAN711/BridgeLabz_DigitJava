public class UC4_InsertBetween {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(70);

        list.insertAfter(56, 30);

        list.display();
    }
}