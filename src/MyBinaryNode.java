public class MyBinaryNode<T extends Comparable<T>> {

    T data;
    MyBinaryNode<T> left;
    MyBinaryNode<T> right;

    public MyBinaryNode(T data) {
        this.data = data;
    }
}