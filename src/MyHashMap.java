public class MyHashMap<K, V> {

    private int size = 10;
    private MyMapNode<K, V>[] bucket;

    public MyHashMap() {
        bucket = new MyMapNode[size];
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        MyMapNode<K, V> head = bucket[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.next = bucket[index];
        bucket[index] = newNode;
    }

    public V get(K key) {
        int index = getIndex(key);

        MyMapNode<K, V> head = bucket[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);

        MyMapNode<K, V> head = bucket[index];
        MyMapNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    bucket[index] = head.next;
                else
                    prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            MyMapNode<K, V> head = bucket[i];
            while (head != null) {
                System.out.println(head.key + " -> " + head.value);
                head = head.next;
            }
        }
    }
}