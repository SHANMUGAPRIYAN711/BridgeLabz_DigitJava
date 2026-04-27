public class UC1_CreateList {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(70);
        list.add(30);
        list.add(56);

        list.display(); // 56->30->70
    }
}