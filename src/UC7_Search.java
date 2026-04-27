public class UC7_Search {
    public static void execute() {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Found 30: " + list.search(30));
    }
}