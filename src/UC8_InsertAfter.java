public class UC8_InsertAfter {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        list.insertAfter(30, 40);

        list.display();
    }
}