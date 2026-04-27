public class UC9_DeleteAndSize {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        list.delete(40);

        list.display();
        System.out.println("Size: " + list.size());
    }
}