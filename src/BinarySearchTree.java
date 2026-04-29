public class BinarySearchTree<T extends Comparable<T>> {

    MyBinaryNode<T> root;

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private MyBinaryNode<T> addRecursive(MyBinaryNode<T> current, T data) {
        if (current == null) {
            return new MyBinaryNode<>(data);
        }

        if (data.compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);
        } else {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    public boolean search(T key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(MyBinaryNode<T> current, T key) {
        if (current == null) return false;

        if (key.equals(current.data)) return true;

        return key.compareTo(current.data) < 0
                ? searchRecursive(current.left, key)
                : searchRecursive(current.right, key);
    }

    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(MyBinaryNode<T> node) {
        if (node == null) return 0;
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }
}