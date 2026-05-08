package Searching;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int size = 5000;

        int[] arr1 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(10000);
        }

        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        // Bubble Sort
        long start1 = System.nanoTime();

        bubbleSort(arr1);

        long end1 = System.nanoTime();

        System.out.println("Bubble Sort Time: "
                + (end1 - start1));

        // Merge Sort
        long start2 = System.nanoTime();

        Arrays.sort(arr2);

        long end2 = System.nanoTime();

        System.out.println("Merge Sort Time: "
                + (end2 - start2));

        // Quick Sort
        long start3 = System.nanoTime();

        Arrays.parallelSort(arr3);

        long end3 = System.nanoTime();

        System.out.println("Quick Sort Time: "
                + (end3 - start3));
    }
}
