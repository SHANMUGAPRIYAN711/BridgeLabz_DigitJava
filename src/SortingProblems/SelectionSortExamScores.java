package SortingProblems;

import java.util.Arrays;

public class SelectionSortExamScores {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {75, 45, 95, 60};

        selectionSort(scores);

        System.out.println(Arrays.toString(scores));
    }
}
