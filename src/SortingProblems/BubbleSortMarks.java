package SortingProblems;

import java.util.Arrays;

public class BubbleSortMarks {

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

        int[] marks = {85, 45, 90, 32, 70};

        bubbleSort(marks);

        System.out.println(Arrays.toString(marks));
    }
}
