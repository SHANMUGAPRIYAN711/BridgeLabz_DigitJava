package Searching;

import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        int size = 100000;

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {

            list.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = 99999;

        // ArrayList Search
        long start1 = System.nanoTime();

        list.contains(target);

        long end1 = System.nanoTime();

        System.out.println("ArrayList Search Time: "
                + (end1 - start1));

        // HashSet Search
        long start2 = System.nanoTime();

        hashSet.contains(target);

        long end2 = System.nanoTime();

        System.out.println("HashSet Search Time: "
                + (end2 - start2));

        // TreeSet Search
        long start3 = System.nanoTime();

        treeSet.contains(target);

        long end3 = System.nanoTime();

        System.out.println("TreeSet Search Time: "
                + (end3 - start3));
    }
}
