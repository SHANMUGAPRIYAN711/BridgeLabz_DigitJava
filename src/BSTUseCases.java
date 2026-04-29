public class BSTUseCases {
    public static void execute() {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC1
        bst.add(56);
        bst.add(30);
        bst.add(70);

        // UC2 (extended tree)
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Size: " + bst.size());

        // UC3
        System.out.println("Search 63: " + bst.search(63));
    }
}